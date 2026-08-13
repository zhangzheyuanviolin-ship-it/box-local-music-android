            package com.google.ai.edge.litertlm;

            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/google/ai/edge/litertlm/InputData;", "", "<init>", "()V", "Text", "Audio", "Image", "Lcom/google/ai/edge/litertlm/InputData$Audio;", "Lcom/google/ai/edge/litertlm/InputData$Image;", "Lcom/google/ai/edge/litertlm/InputData$Text;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */     public abstract class InputData {

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/litertlm/InputData$Audio;", "Lcom/google/ai/edge/litertlm/InputData;", "bytes", "", "<init>", "([B)V", "getBytes", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Audio extends InputData {
                    private final byte[] bytes;

                    public Audio(byte[] bArr) {
/* 2 */                 super(null);
/* 5 */                 this.bytes = bArr;
                    }

                    public static Audio copy$default(Audio audio, byte[] bArr, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     bArr = audio.bytes;
                        }
/* 7 */                 return audio.copy(bArr);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public final Audio copy(byte[] bytes) {
/* 3 */                 return new Audio(bytes);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof Audio) && O0000Ioio00.I0000O(this.bytes, ((Audio) other).bytes);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public int hashCode() {
/* 3 */                 return Arrays.hashCode(this.bytes);
                    }

                    public String toString() {
/* 11 */                return IlIi0I0.I000lI("Audio(bytes=", Arrays.toString(this.bytes), ")");
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/litertlm/InputData$Image;", "Lcom/google/ai/edge/litertlm/InputData;", "bytes", "", "<init>", "([B)V", "getBytes", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Image extends InputData {
                    private final byte[] bytes;

                    public Image(byte[] bArr) {
/* 2 */                 super(null);
/* 5 */                 this.bytes = bArr;
                    }

                    public static Image copy$default(Image image, byte[] bArr, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     bArr = image.bytes;
                        }
/* 7 */                 return image.copy(bArr);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public final Image copy(byte[] bytes) {
/* 3 */                 return new Image(bytes);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof Image) && O0000Ioio00.I0000O(this.bytes, ((Image) other).bytes);
                    }

                    public final byte[] getBytes() {
/* 1 */                 return this.bytes;
                    }

                    public int hashCode() {
/* 3 */                 return Arrays.hashCode(this.bytes);
                    }

                    public String toString() {
/* 11 */                return IlIi0I0.I000lI("Image(bytes=", Arrays.toString(this.bytes), ")");
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/ai/edge/litertlm/InputData$Text;", "Lcom/google/ai/edge/litertlm/InputData;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Text extends InputData {
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

                    public String toString() {
/* 7 */                 return IlIi0I0.I000lI("Text(text=", this.text, ")");
                    }
                }

                public InputData(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */             this();
                }

/* 4 */         private InputData() {
                }
            }
