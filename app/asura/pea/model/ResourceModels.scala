package asura.pea.model

object ResourceModels {

  case class ResourceCheckRequest(
                                   file: String, // relative path to `user-data` files
                                 )

  case class ResourceInfo(
                           exists: Boolean,
                           isDirectory: Boolean,
                           size: Long = 0L,
                           modified: Long = 0L,
                         )

}
