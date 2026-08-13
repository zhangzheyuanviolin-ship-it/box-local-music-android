            package com.google.ai.edge.litertlm;

            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1oI0iiI;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.O01l0lO0li;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/ai/edge/litertlm/Content;", "", "<init>", "()V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "Text", "ImageBytes", "ImageFile", "AudioBytes", "AudioFile", "ToolResponse", "Lcom/google/ai/edge/litertlm/Content$AudioBytes;", "Lcom/google/ai/edge/litertlm/Content$AudioFile;", "Lcom/google/ai/edge/litertlm/Content$ImageBytes;", "Lcom/google/ai/edge/litertlm/Content$ImageFile;", "Lcom/google/ai/edge/litertlm/Content$Text;", "Lcom/google/ai/edge/litertlm/Content$ToolResponse;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */     public abstract class Content {

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$AudioBytes;", "Lcom/google/ai/edge/litertlm/Content;", "", "bytes", "<init>", "([B)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()[B", "copy", "([B)Lcom/google/ai/edge/litertlm/Content$AudioBytes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "[B", "getBytes", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class AudioBytes extends Content {
                    private final byte[] bytes;

                    public AudioBytes(byte[] bArr) {
/* 2 */                 super(null);
/* 5 */                 this.bytes = bArr;
                    }

                    public static AudioBytes copy$default(AudioBytes audioBytes, byte[] bArr, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     bArr = audioBytes.bytes;
                        }
/* 7 */                 return audioBytes.copy(bArr);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public final AudioBytes copy(byte[] bytes) {
/* 3 */                 return new AudioBytes(bytes);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof AudioBytes) && O0000Ioio00.I0000O(this.bytes, ((AudioBytes) other).bytes);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public int hashCode() {
/* 3 */                 return Arrays.hashCode(this.bytes);
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "audio");
/* 23 */                o01l0lO0li.I0001Ioi1lo("blob", I1oI0iiI.I00000oOI(I1oI0iiI.I0000oI00, this.bytes));
/* 55 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 11 */                return IlIi0I0.I000lI("AudioBytes(bytes=", Arrays.toString(this.bytes), ")");
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$AudioFile;", "Lcom/google/ai/edge/litertlm/Content;", "", "absolutePath", "<init>", "(Ljava/lang/String;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/google/ai/edge/litertlm/Content$AudioFile;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAbsolutePath", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class AudioFile extends Content {
                    private final String absolutePath;

                    public AudioFile(String str) {
/* 2 */                 super(null);
/* 5 */                 this.absolutePath = str;
                    }

                    public static AudioFile copy$default(AudioFile audioFile, String str, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = audioFile.absolutePath;
                        }
/* 7 */                 return audioFile.copy(str);
                    }

                    public final String getAbsolutePath() {
/* 1 */                 return this.absolutePath;
                    }

                    public final AudioFile copy(String absolutePath) {
/* 3 */                 return new AudioFile(absolutePath);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof AudioFile) && O0000Ioio00.I0000O(this.absolutePath, ((AudioFile) other).absolutePath);
                    }

                    public final String getAbsolutePath() {
/* 1 */                 return this.absolutePath;
                    }

                    public int hashCode() {
/* 3 */                 return this.absolutePath.hashCode();
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "audio");
/* 17 */                o01l0lO0li.I0001Ioi1lo("path", this.absolutePath);
/* 20 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 7 */                 return IlIi0I0.I000lI("AudioFile(absolutePath=", this.absolutePath, ")");
                    }
                }

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$ImageBytes;", "Lcom/google/ai/edge/litertlm/Content;", "", "bytes", "<init>", "([B)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()[B", "copy", "([B)Lcom/google/ai/edge/litertlm/Content$ImageBytes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "[B", "getBytes", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class ImageBytes extends Content {
                    private final byte[] bytes;

                    public ImageBytes(byte[] bArr) {
/* 2 */                 super(null);
/* 5 */                 this.bytes = bArr;
                    }

                    public static ImageBytes copy$default(ImageBytes imageBytes, byte[] bArr, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     bArr = imageBytes.bytes;
                        }
/* 7 */                 return imageBytes.copy(bArr);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public final ImageBytes copy(byte[] bytes) {
/* 3 */                 return new ImageBytes(bytes);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof ImageBytes) && O0000Ioio00.I0000O(this.bytes, ((ImageBytes) other).bytes);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public int hashCode() {
/* 3 */                 return Arrays.hashCode(this.bytes);
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "image");
/* 23 */                o01l0lO0li.I0001Ioi1lo("blob", I1oI0iiI.I00000oOI(I1oI0iiI.I0000oI00, this.bytes));
/* 55 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 11 */                return IlIi0I0.I000lI("ImageBytes(bytes=", Arrays.toString(this.bytes), ")");
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$ImageFile;", "Lcom/google/ai/edge/litertlm/Content;", "", "absolutePath", "<init>", "(Ljava/lang/String;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/google/ai/edge/litertlm/Content$ImageFile;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAbsolutePath", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class ImageFile extends Content {
                    private final String absolutePath;

                    public ImageFile(String str) {
/* 2 */                 super(null);
/* 5 */                 this.absolutePath = str;
                    }

                    public static ImageFile copy$default(ImageFile imageFile, String str, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = imageFile.absolutePath;
                        }
/* 7 */                 return imageFile.copy(str);
                    }

                    public final String getAbsolutePath() {
/* 1 */                 return this.absolutePath;
                    }

                    public final ImageFile copy(String absolutePath) {
/* 3 */                 return new ImageFile(absolutePath);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof ImageFile) && O0000Ioio00.I0000O(this.absolutePath, ((ImageFile) other).absolutePath);
                    }

                    public final String getAbsolutePath() {
/* 1 */                 return this.absolutePath;
                    }

                    public int hashCode() {
/* 3 */                 return this.absolutePath.hashCode();
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "image");
/* 17 */                o01l0lO0li.I0001Ioi1lo("path", this.absolutePath);
/* 20 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 7 */                 return IlIi0I0.I000lI("ImageFile(absolutePath=", this.absolutePath, ")");
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$Text;", "Lcom/google/ai/edge/litertlm/Content;", "", "text", "<init>", "(Ljava/lang/String;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/google/ai/edge/litertlm/Content$Text;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Text extends Content {
                    private final String text;

                    public Text(String str) {
/* 2 */                 super(null);
/* 5 */                 this.text = str;
                    }

                    public static Text copy$default(Text text, String str, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = text.text;
                        }
/* 7 */                 return text.copy(str);
                    }

                    public final String getText() {
/* 1 */                 return this.text;
                    }

                    public final Text copy(String text) {
/* 3 */                 return new Text(text);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof Text) && O0000Ioio00.I0000O(this.text, ((Text) other).text);
                    }

                    public final String getText() {
/* 1 */                 return this.text;
                    }

                    public int hashCode() {
/* 3 */                 return this.text.hashCode();
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "text");
/* 15 */                o01l0lO0li.I0001Ioi1lo("text", this.text);
/* 20 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 1 */                 return this.text;
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/google/ai/edge/litertlm/Content$ToolResponse;", "Lcom/google/ai/edge/litertlm/Content;", "", "name", "", "response", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/ai/edge/litertlm/Content$ToolResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getResponse", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class ToolResponse extends Content {
                    private final String name;
                    private final Object response;

                    public ToolResponse(String str, Object obj) {
/* 2 */                 super(null);
/* 5 */                 this.name = str;
/* 7 */                 this.response = obj;
                    }

                    public static ToolResponse copy$default(ToolResponse toolResponse, String str, Object obj, int i, Object obj2) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = toolResponse.name;
                        }
/* 9 */                 if ((i & 2) != 0) {
/* 11 */                    obj = toolResponse.response;
                        }
/* 13 */                return toolResponse.copy(str, obj);
                    }

                    public final String getName() {
/* 1 */                 return this.name;
                    }

                    public final Object getResponse() {
/* 1 */                 return this.response;
                    }

                    public final ToolResponse copy(String name, Object response) {
/* 3 */                 return new ToolResponse(name, response);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof ToolResponse)) {
/* 7 */                     return false;
                        }
/* 11 */                ToolResponse toolResponse = (ToolResponse) other;
                        return O0000Ioio00.I0000O(this.name, toolResponse.name) && O0000Ioio00.I0000O(this.response, toolResponse.response);
                    }

                    public final String getName() {
/* 1 */                 return this.name;
                    }

                    public final Object getResponse() {
/* 1 */                 return this.response;
                    }

                    public int hashCode() {
/* 7 */                 int iHashCode = this.name.hashCode() * 31;
/* 9 */                 Object obj = this.response;
/* 19 */                return iHashCode + (obj == null ? 0 : obj.hashCode());
                    }

                    @Override
                    public O01l0lO0li mo11x6d7146a3() {
/* 3 */                 O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */                o01l0lO0li.I0001Ioi1lo("type", "tool_response");
/* 17 */                o01l0lO0li.I0001Ioi1lo("name", this.name);
/* 28 */                o01l0lO0li.I0000oI00("response", JsonConvertersKt.toJsonElement(this.response));
/* 55 */                return o01l0lO0li;
                    }

                    public String toString() {
/* 28 */                return "ToolResponse(name=" + this.name + ", response=" + this.response + ")";
                    }
                }

                public Content(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */             this();
                }

                public abstract O01l0lO0li mo11x6d7146a3();

/* 4 */         private Content() {
                }
            }
