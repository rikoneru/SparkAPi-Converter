spark.read.text("filename").take(2).map(_.getString(0))