            package com.google.ai.edge.litert;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.Il0lIli0;
            import p000.Oi010OO0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/google/ai/edge/litert/Accelerator;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "CPU", "GPU", "NPU", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Accelerator {
                private static final Il0lIli0 $ENTRIES;
                private static final Accelerator[] $VALUES;

                public static final Companion INSTANCE;
                private final int value;
                public static final Accelerator NONE = new Accelerator("NONE", 0, 0);
                public static final Accelerator CPU = new Accelerator("CPU", 1, 1);
                public static final Accelerator GPU = new Accelerator("GPU", 2, 2);
                public static final Accelerator NPU = new Accelerator("NPU", 3, 3);

                private static final Accelerator[] $values() {
/* 9 */             return new Accelerator[]{NONE, CPU, GPU, NPU};
                }

                static {
/* 41 */            Accelerator[] acceleratorArr$values = $values();
/* 45 */            $VALUES = acceleratorArr$values;
/* 51 */            $ENTRIES = ilIII1o11.I00000oIO(acceleratorArr$values);
/* 59 */            INSTANCE = new Companion(null);
                }

                private Accelerator(String str, int i, int i2) {
/* 4 */             this.value = i2;
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static Accelerator valueOf(String str) {
/* 7 */             return (Accelerator) Enum.valueOf(Accelerator.class, str);
                }

                public static Accelerator[] values() {
/* 7 */             return (Accelerator[]) $VALUES.clone();
                }

                public final int getValue() {
/* 1 */             return this.value;
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/litert/Accelerator$Companion;", "", "<init>", "()V", "of", "Lcom/google/ai/edge/litert/Accelerator;", "value", "", "of$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Accelerator of$third_party_odml_litert_litert_kotlin_litert_kotlin_api(int value) {
/* 1 */                 Accelerator accelerator = Accelerator.NONE;
/* 7 */                 if (value == accelerator.getValue()) {
/* 9 */                     return accelerator;
                        }
/* 10 */                Accelerator accelerator2 = Accelerator.CPU;
/* 16 */                if (value == accelerator2.getValue()) {
/* 18 */                    return accelerator2;
                        }
/* 19 */                Accelerator accelerator3 = Accelerator.GPU;
/* 25 */                if (value == accelerator3.getValue()) {
/* 27 */                    return accelerator3;
                        }
/* 28 */                Accelerator accelerator4 = Accelerator.NPU;
/* 34 */                if (value == accelerator4.getValue()) {
/* 36 */                    return accelerator4;
                        }
/* 43 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(value, "Invalid accelerator value: "));
/* 46 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
