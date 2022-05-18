def call(Map config = [:]) {
    sh "echo Hey Hellow ${config.name}. Today is ${config.dayOfWeek}."
}
