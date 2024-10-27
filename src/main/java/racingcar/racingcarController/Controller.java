package racingcar.racingcarController;

import java.util.LinkedHashMap;
import java.util.Map;
import racingcar.racingcarModel.CarModel;
import racingcar.racingcarModel.ExceptionModel;
import racingcar.racingcarView.CarView;

public class Controller {
    private final CarView carView;
    private final CarModel carModel;
    private final ExceptionModel exceptionModel;

    public Controller(CarView carView, CarModel carModel, ExceptionModel exceptionModel) {
        this.carView = carView;
        this.carModel = carModel;
        this.exceptionModel = exceptionModel;
    }

    public void run() {
        carView.printNameInputMessage();
        String nameInput = carView.readInput();
        carView.printTryInputMessage();
        String beforeTryInput = carView.readInput();

        //예외 검사
        exceptionModel.executeExceptionalHandling(() -> {
            exceptionModel.emptyCarName(nameInput);
            exceptionModel.emptyCarNames(nameInput);
            exceptionModel.overFiveCarNames(nameInput);
            exceptionModel.uniqueCarNames(nameInput);
            exceptionModel.emptyTryInput(beforeTryInput);
            exceptionModel.overIntTryInput(beforeTryInput);
            exceptionModel.isNumberTryInput(beforeTryInput);
            exceptionModel.isPositiveNumberTryInput(beforeTryInput);
        });

        int tryInput = Integer.parseInt(beforeTryInput);

        LinkedHashMap<String, Integer> carInfo = carModel.initializeCarInfo(nameInput);

        carView.printStartResults();

        for (int i = 0; i < tryInput; i++) {
            for (Map.Entry<String, Integer> entry : carInfo.entrySet()) {
                carInfo.put(entry.getKey(), carModel.isForward(entry.getValue()));
                carView.printResults(entry);
            }
            System.out.println();
        }

        int maxValue = carModel.maxValue(carInfo);
        String winner = carModel.winnerCar(carInfo,maxValue);
        carView.printWinners(winner);



    }



}
