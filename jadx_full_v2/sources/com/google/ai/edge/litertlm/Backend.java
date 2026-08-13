            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/google/ai/edge/litertlm/Backend;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "CPU", "GPU", "NPU", "Lcom/google/ai/edge/litertlm/Backend$CPU;", "Lcom/google/ai/edge/litertlm/Backend$GPU;", "Lcom/google/ai/edge/litertlm/Backend$NPU;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 5 */     public abstract class Backend {
                private final String name;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/ai/edge/litertlm/Backend$GPU;", "Lcom/google/ai/edge/litertlm/Backend;", "<init>", "()V", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class GPU extends Backend {
                    public GPU() {
/* 4 */                 super("GPU", null);
                    }
                }

                private Backend(String str) {
/* 4 */             this.name = str;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

/* 6 */         public Backend(String str, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this(str);
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/google/ai/edge/litertlm/Backend$CPU;", "Lcom/google/ai/edge/litertlm/Backend;", "numOfThreads", "", "<init>", "(Ljava/lang/Integer;)V", "getNumOfThreads", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/google/ai/edge/litertlm/Backend$CPU;", "equals", "", "other", "", "hashCode", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 8 */         public static final class CPU extends Backend {
                    private final Integer numOfThreads;

                    public CPU(Integer num) {
/* 4 */                 super("CPU", null);
/* 7 */                 this.numOfThreads = num;
                    }

                    public static CPU copy$default(CPU cpu, Integer num, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     num = cpu.numOfThreads;
                        }
/* 7 */                 return cpu.copy(num);
                    }

                    public final Integer getNumOfThreads() {
/* 1 */                 return this.numOfThreads;
                    }

                    public final CPU copy(Integer numOfThreads) {
/* 3 */                 return new CPU(numOfThreads);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof CPU) && O0000Ioio00.I0000O(this.numOfThreads, ((CPU) other).numOfThreads);
                    }

                    public final Integer getNumOfThreads() {
/* 1 */                 return this.numOfThreads;
                    }

                    public int hashCode() {
/* 1 */                 Integer num = this.numOfThreads;
/* 3 */                 if (num == null) {
/* 5 */                     return 0;
                        }
/* 7 */                 return num.hashCode();
                    }

                    public String toString() {
/* 18 */                return "CPU(numOfThreads=" + this.numOfThreads + ")";
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 9 */             public CPU() {
/* 10 */                this(null, 1, 0 == true ? 1 : 0);
                    }

/* 10 */            public CPU(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 11 */                this((i & 1) != 0 ? null : num);
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/ai/edge/litertlm/Backend$NPU;", "Lcom/google/ai/edge/litertlm/Backend;", "nativeLibraryDir", "", "<init>", "(Ljava/lang/String;)V", "getNativeLibraryDir", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 9 */         public static final class NPU extends Backend {
                    private final String nativeLibraryDir;

                    public NPU(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */                 this((i & 1) != 0 ? "" : str);
                    }

                    public static NPU copy$default(NPU npu, String str, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     str = npu.nativeLibraryDir;
                        }
/* 7 */                 return npu.copy(str);
                    }

                    public final String getNativeLibraryDir() {
/* 1 */                 return this.nativeLibraryDir;
                    }

                    public final NPU copy(String nativeLibraryDir) {
/* 3 */                 return new NPU(nativeLibraryDir);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof NPU) && O0000Ioio00.I0000O(this.nativeLibraryDir, ((NPU) other).nativeLibraryDir);
                    }

                    public final String getNativeLibraryDir() {
/* 1 */                 return this.nativeLibraryDir;
                    }

                    public int hashCode() {
/* 3 */                 return this.nativeLibraryDir.hashCode();
                    }

                    public String toString() {
/* 7 */                 return IlIi0I0.I000lI("NPU(nativeLibraryDir=", this.nativeLibraryDir, ")");
                    }

/* 10 */            public NPU(String str) {
/* 11 */                super("NPU", null);
                        this.nativeLibraryDir = str;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 11 */            public NPU() {
/* 12 */                this(null, 1, 0 == true ? 1 : 0);
                    }
                }
            }
