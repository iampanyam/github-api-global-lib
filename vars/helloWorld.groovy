def call(Map config = [:]) {
    sh "echo hey Hello ${config.name}. Today is ${config.dayOfWeek}."
}
