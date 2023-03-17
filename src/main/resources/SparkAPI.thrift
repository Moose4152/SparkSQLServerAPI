namespace java com.github.msr

struct TResults {
 1: list<list<string>> results
 2: optional list<string> schema
 3: optional string errorMessage
}

service SparkAPI {
    TResults exectureCommand(1: string sql_statment)
    string readFile(1: string pathOfFile)
}