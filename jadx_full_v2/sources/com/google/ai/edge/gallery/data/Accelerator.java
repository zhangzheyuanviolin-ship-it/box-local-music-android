            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/gallery/data/Accelerator;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "CPU", "GPU", "NPU", "TPU", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Accelerator {
                private static final Il0lIli0 $ENTRIES;
                private static final Accelerator[] $VALUES;
                public static final Accelerator CPU = new Accelerator("CPU", 0, "CPU");
                public static final Accelerator GPU = new Accelerator("GPU", 1, "GPU");
                public static final Accelerator NPU = new Accelerator("NPU", 2, "NPU");
                public static final Accelerator TPU = new Accelerator("TPU", 3, "TPU");
                private final String label;

                private static final Accelerator[] $values() {
/* 9 */             return new Accelerator[]{CPU, GPU, NPU, TPU};
                }

                static {
/* 41 */            Accelerator[] acceleratorArr$values = $values();
/* 45 */            $VALUES = acceleratorArr$values;
/* 51 */            $ENTRIES = ilIII1o11.I00000oIO(acceleratorArr$values);
                }

                private Accelerator(String str, int i, String str2) {
/* 4 */             this.label = str2;
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

                public final String getLabel() {
/* 1 */             return this.label;
                }
            }
