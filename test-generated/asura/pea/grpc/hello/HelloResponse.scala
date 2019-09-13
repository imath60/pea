// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package asura.pea.grpc.hello

@SerialVersionUID(0L)
final case class HelloResponse(
    reply: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[HelloResponse] with scalapb.lenses.Updatable[HelloResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = reply
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = reply
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): asura.pea.grpc.hello.HelloResponse = {
      var __reply = this.reply
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __reply = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      asura.pea.grpc.hello.HelloResponse(
          reply = __reply
      )
    }
    def withReply(__v: _root_.scala.Predef.String): HelloResponse = copy(reply = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = reply
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(reply)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = asura.pea.grpc.hello.HelloResponse
}

object HelloResponse extends scalapb.GeneratedMessageCompanion[asura.pea.grpc.hello.HelloResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[asura.pea.grpc.hello.HelloResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): asura.pea.grpc.hello.HelloResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    asura.pea.grpc.hello.HelloResponse(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[asura.pea.grpc.hello.HelloResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      asura.pea.grpc.hello.HelloResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HelloProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = asura.pea.grpc.hello.HelloResponse(
  )
  implicit class HelloResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, asura.pea.grpc.hello.HelloResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, asura.pea.grpc.hello.HelloResponse](_l) {
    def reply: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.reply)((c_, f_) => c_.copy(reply = f_))
  }
  final val REPLY_FIELD_NUMBER = 1
  def of(
    reply: _root_.scala.Predef.String
  ): _root_.asura.pea.grpc.hello.HelloResponse = _root_.asura.pea.grpc.hello.HelloResponse(
    reply
  )
}