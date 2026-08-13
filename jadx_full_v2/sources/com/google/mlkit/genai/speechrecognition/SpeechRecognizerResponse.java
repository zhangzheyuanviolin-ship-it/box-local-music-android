            package com.google.mlkit.genai.speechrecognition;

            import com.google.mlkit.genai.common.GenAiException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "", "<init>", "()V", "PartialTextResponse", "FinalTextResponse", "ErrorResponse", "CompletedResponse", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$CompletedResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$ErrorResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$FinalTextResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$PartialTextResponse;", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
/* 3 */     public abstract class SpeechRecognizerResponse {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$CompletedResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "<init>", "()V", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class CompletedResponse extends SpeechRecognizerResponse {
                    public static final CompletedResponse INSTANCE = new CompletedResponse();

                    private CompletedResponse() {
/* 2 */                 super(null);
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$ErrorResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "e", "Lcom/google/mlkit/genai/common/GenAiException;", "<init>", "(Lcom/google/mlkit/genai/common/GenAiException;)V", "getE", "()Lcom/google/mlkit/genai/common/GenAiException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class ErrorResponse extends SpeechRecognizerResponse {
                    private final GenAiException zza;

                    public ErrorResponse(GenAiException genAiException) {
/* 2 */                 super(null);
/* 5 */                 this.zza = genAiException;
                    }

                    public final GenAiException getZza() {
/* 1 */                 return this.zza;
                    }

                    public final ErrorResponse copy(GenAiException e) {
/* 3 */                 return new ErrorResponse(e);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof ErrorResponse) && O0000Ioio00.I0000O(this.zza, ((ErrorResponse) other).zza);
                    }

                    public final GenAiException getE() {
/* 1 */                 return this.zza;
                    }

                    public int hashCode() {
/* 3 */                 return this.zza.hashCode();
                    }

                    public String toString() {
/* 18 */                return "ErrorResponse(e=" + this.zza + ")";
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$FinalTextResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class FinalTextResponse extends SpeechRecognizerResponse {
                    private final String zza;

                    public FinalTextResponse(String str) {
/* 2 */                 super(null);
/* 5 */                 this.zza = str;
                    }

                    public final String getZza() {
/* 1 */                 return this.zza;
                    }

                    public final FinalTextResponse copy(String text) {
/* 3 */                 return new FinalTextResponse(text);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof FinalTextResponse) && O0000Ioio00.I0000O(this.zza, ((FinalTextResponse) other).zza);
                    }

                    public final String getText() {
/* 1 */                 return this.zza;
                    }

                    public int hashCode() {
/* 3 */                 return this.zza.hashCode();
                    }

                    public String toString() {
/* 12 */                return IIl001iO0Io.I00100l0(new StringBuilder("FinalTextResponse(text="), this.zza, ")");
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse$PartialTextResponse;", "Lcom/google/mlkit/genai/speechrecognition/SpeechRecognizerResponse;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "java.com.google.android.libraries.mlkit.granules.genai.speech_mlkit_genai_speech"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class PartialTextResponse extends SpeechRecognizerResponse {
                    private final String zza;

                    public PartialTextResponse(String str) {
/* 2 */                 super(null);
/* 5 */                 this.zza = str;
                    }

                    public final String getZza() {
/* 1 */                 return this.zza;
                    }

                    public final PartialTextResponse copy(String text) {
/* 3 */                 return new PartialTextResponse(text);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof PartialTextResponse) && O0000Ioio00.I0000O(this.zza, ((PartialTextResponse) other).zza);
                    }

                    public final String getText() {
/* 1 */                 return this.zza;
                    }

                    public int hashCode() {
/* 3 */                 return this.zza.hashCode();
                    }

                    public String toString() {
/* 12 */                return IIl001iO0Io.I00100l0(new StringBuilder("PartialTextResponse(text="), this.zza, ")");
                    }
                }

                public SpeechRecognizerResponse(DefaultConstructorMarker defaultConstructorMarker) {
                }

/* 4 */         private SpeechRecognizerResponse() {
/* 5 */             throw null;
                }
            }
