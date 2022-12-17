package menu.view

import menu.domain.resource.SEPARATOR

class InputView {

    fun readCoachName() {
        println(INPUT_COACH_NAME)

        val names = readLine()?.trim()

    }

    companion object {
        const val INPUT_COACH_NAME = "코치의 이름을 입력해 주세요. ($SEPARATOR 로 구분)"
        const val INPUT_FOOD_CANT_EAT = "%s(이)가 못 먹는 메뉴를 입력해 주세요."
    }
}