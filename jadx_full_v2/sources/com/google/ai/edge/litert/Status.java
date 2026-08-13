            package com.google.ai.edge.litert;

            import com.google.mlkit.genai.common.GenAiException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.Il0lIli0;
            import p000.Oi010OO0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006("}, d2 = {"Lcom/google/ai/edge/litert/Status;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "Ok", "ErrorInvalidArgument", "ErrorMemoryAllocationFailure", "ErrorRuntimeFailure", "ErrorMissingInputTensor", "ErrorUnsupported", "ErrorNotFound", "ErrorTimeoutExpired", "ErrorWrongVersion", "ErrorUnknown", "ErrorAlreadyExists", "ErrorCancelled", "ErrorFileIO", "ErrorInvalidFlatbuffer", "ErrorDynamicLoading", "ErrorSerialization", "ErrorCompilation", "ErrorIndexOOB", "ErrorInvalidIrType", "ErrorInvalidGraphInvariant", "ErrorGraphModification", "ErrorInvalidToolConfig", "LegalizeNoMatch", "ErrorInvalidLegalization", "PatternNoMatch", "ErrorInvalidTransformation", "ErrorUnsupportedRuntimeVersion", "ErrorUnsupportedCompilerVersion", "ErrorIncompatibleByteCodeVersion", "ErrorUnsupportedShapeInferencedOp", "ErrorShapeInferenceFailed", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Status {
                private static final Il0lIli0 $ENTRIES;
                private static final Status[] $VALUES;

                public static final Companion INSTANCE;
                private final int code;
                public static final Status Ok = new Status("Ok", 0, 0);
                public static final Status ErrorInvalidArgument = new Status("ErrorInvalidArgument", 1, 1);
                public static final Status ErrorMemoryAllocationFailure = new Status("ErrorMemoryAllocationFailure", 2, 2);
                public static final Status ErrorRuntimeFailure = new Status("ErrorRuntimeFailure", 3, 3);
                public static final Status ErrorMissingInputTensor = new Status("ErrorMissingInputTensor", 4, 4);
                public static final Status ErrorUnsupported = new Status("ErrorUnsupported", 5, 5);
                public static final Status ErrorNotFound = new Status("ErrorNotFound", 6, 6);
                public static final Status ErrorTimeoutExpired = new Status("ErrorTimeoutExpired", 7, 7);
                public static final Status ErrorWrongVersion = new Status("ErrorWrongVersion", 8, 8);
                public static final Status ErrorUnknown = new Status("ErrorUnknown", 9, 9);
                public static final Status ErrorAlreadyExists = new Status("ErrorAlreadyExists", 10, 10);
                public static final Status ErrorCancelled = new Status("ErrorCancelled", 11, 11);
                public static final Status ErrorFileIO = new Status("ErrorFileIO", 12, 500);
                public static final Status ErrorInvalidFlatbuffer = new Status("ErrorInvalidFlatbuffer", 13, GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE);
                public static final Status ErrorDynamicLoading = new Status("ErrorDynamicLoading", 14, 502);
                public static final Status ErrorSerialization = new Status("ErrorSerialization", 15, 503);
                public static final Status ErrorCompilation = new Status("ErrorCompilation", 16, 504);
                public static final Status ErrorIndexOOB = new Status("ErrorIndexOOB", 17, 1000);
                public static final Status ErrorInvalidIrType = new Status("ErrorInvalidIrType", 18, 1001);
                public static final Status ErrorInvalidGraphInvariant = new Status("ErrorInvalidGraphInvariant", 19, 1002);
                public static final Status ErrorGraphModification = new Status("ErrorGraphModification", 20, 1003);
                public static final Status ErrorInvalidToolConfig = new Status("ErrorInvalidToolConfig", 21, 1500);
                public static final Status LegalizeNoMatch = new Status("LegalizeNoMatch", 22, 2000);
                public static final Status ErrorInvalidLegalization = new Status("ErrorInvalidLegalization", 23, 2001);
                public static final Status PatternNoMatch = new Status("PatternNoMatch", 24, 3000);
                public static final Status ErrorInvalidTransformation = new Status("ErrorInvalidTransformation", 25, 3001);
                public static final Status ErrorUnsupportedRuntimeVersion = new Status("ErrorUnsupportedRuntimeVersion", 26, 4000);
                public static final Status ErrorUnsupportedCompilerVersion = new Status("ErrorUnsupportedCompilerVersion", 27, 4001);
                public static final Status ErrorIncompatibleByteCodeVersion = new Status("ErrorIncompatibleByteCodeVersion", 28, 4002);
                public static final Status ErrorUnsupportedShapeInferencedOp = new Status("ErrorUnsupportedShapeInferencedOp", 29, 5000);
                public static final Status ErrorShapeInferenceFailed = new Status("ErrorShapeInferenceFailed", 30, 5001);

                private static final Status[] $values() {
/* 63 */            return new Status[]{Ok, ErrorInvalidArgument, ErrorMemoryAllocationFailure, ErrorRuntimeFailure, ErrorMissingInputTensor, ErrorUnsupported, ErrorNotFound, ErrorTimeoutExpired, ErrorWrongVersion, ErrorUnknown, ErrorAlreadyExists, ErrorCancelled, ErrorFileIO, ErrorInvalidFlatbuffer, ErrorDynamicLoading, ErrorSerialization, ErrorCompilation, ErrorIndexOOB, ErrorInvalidIrType, ErrorInvalidGraphInvariant, ErrorGraphModification, ErrorInvalidToolConfig, LegalizeNoMatch, ErrorInvalidLegalization, PatternNoMatch, ErrorInvalidTransformation, ErrorUnsupportedRuntimeVersion, ErrorUnsupportedCompilerVersion, ErrorIncompatibleByteCodeVersion, ErrorUnsupportedShapeInferencedOp, ErrorShapeInferenceFailed};
                }

                static {
/* 372 */           Status[] statusArr$values = $values();
/* 376 */           $VALUES = statusArr$values;
/* 382 */           $ENTRIES = ilIII1o11.I00000oIO(statusArr$values);
/* 390 */           INSTANCE = new Companion(null);
                }

                private Status(String str, int i, int i2) {
/* 4 */             this.code = i2;
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static Status valueOf(String str) {
/* 7 */             return (Status) Enum.valueOf(Status.class, str);
                }

                public static Status[] values() {
/* 7 */             return (Status[]) $VALUES.clone();
                }

                public final int getCode() {
/* 1 */             return this.code;
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/ai/edge/litert/Status$Companion;", "", "<init>", "()V", "fromCode", "Lcom/google/ai/edge/litert/Status;", "code", "", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Status fromCode(int code) {
                        Status status;
/* 1 */                 Status[] statusArrValues = Status.values();
/* 5 */                 int length = statusArrValues.length;
/* 6 */                 int i = 0;
                        while (true) {
/* 8 */                     if (i >= length) {
/* 22 */                        status = null;
                                break;
                            }
/* 10 */                    status = statusArrValues[i];
/* 16 */                    if (status.getCode() == code) {
                                break;
                            }
/* 19 */                    i++;
                        }
/* 23 */                if (status != null) {
/* 25 */                    return status;
                        }
/* 32 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(code, "Unknown status code: "));
/* 7 */                 return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
