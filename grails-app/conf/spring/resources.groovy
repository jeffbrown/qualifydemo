// Place your Spring DSL code here
beans = {

    widgetOne(demo.Widget) {
        name = 'One'
    }

    widgetTwo(demo.Widget) {
        name = 'Two'
    }

    myHelper(demo.Helper) { bean ->
        bean.autowire = 'byType'
    }
}
