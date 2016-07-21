package demo

import org.springframework.beans.factory.annotation.Qualifier

class Helper {

    @Qualifier('widgetOne')
    Widget firstOne

    @Qualifier('widgetTwo')
    Widget secondOne
}
