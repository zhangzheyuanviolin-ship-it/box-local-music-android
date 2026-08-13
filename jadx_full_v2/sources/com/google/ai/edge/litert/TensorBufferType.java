            package com.google.ai.edge.litert;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, d2 = {"Lcom/google/ai/edge/litert/TensorBufferType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "Unknown", "HostMemory", "Ahwb", "Ion", "DmaBuf", "FastRpc", "GlBuffer", "GlTexture", "OpenClBuffer", "OpenClBufferFp16", "OpenClTexture", "OpenClTextureFp16", "OpenClBufferPacked", "OpenClImageBuffer", "OpenClImageBufferFp16", "WebGpuBuffer", "WebGpuBufferFp16", "WebGpuTexture", "WebGpuTextureFp16", "WebGpuImageBuffer", "WebGpuImageBufferFp16", "WebGpuBufferPacked", "VulkanBuffer", "VulkanBufferFp16", "VulkanTexture", "VulkanTextureFp16", "VulkanImageBuffer", "VulkanImageBufferFp16", "VulkanBufferPacked", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class TensorBufferType {
                private static final Il0lIli0 $ENTRIES;
                private static final TensorBufferType[] $VALUES;

                public static final Companion INSTANCE;
                private final int type;
                public static final TensorBufferType Unknown = new TensorBufferType("Unknown", 0, 0);
                public static final TensorBufferType HostMemory = new TensorBufferType("HostMemory", 1, 1);
                public static final TensorBufferType Ahwb = new TensorBufferType("Ahwb", 2, 2);
                public static final TensorBufferType Ion = new TensorBufferType("Ion", 3, 3);
                public static final TensorBufferType DmaBuf = new TensorBufferType("DmaBuf", 4, 4);
                public static final TensorBufferType FastRpc = new TensorBufferType("FastRpc", 5, 5);
                public static final TensorBufferType GlBuffer = new TensorBufferType("GlBuffer", 6, 6);
                public static final TensorBufferType GlTexture = new TensorBufferType("GlTexture", 7, 7);
                public static final TensorBufferType OpenClBuffer = new TensorBufferType("OpenClBuffer", 8, 10);
                public static final TensorBufferType OpenClBufferFp16 = new TensorBufferType("OpenClBufferFp16", 9, 11);
                public static final TensorBufferType OpenClTexture = new TensorBufferType("OpenClTexture", 10, 12);
                public static final TensorBufferType OpenClTextureFp16 = new TensorBufferType("OpenClTextureFp16", 11, 13);
                public static final TensorBufferType OpenClBufferPacked = new TensorBufferType("OpenClBufferPacked", 12, 14);
                public static final TensorBufferType OpenClImageBuffer = new TensorBufferType("OpenClImageBuffer", 13, 15);
                public static final TensorBufferType OpenClImageBufferFp16 = new TensorBufferType("OpenClImageBufferFp16", 14, 16);
                public static final TensorBufferType WebGpuBuffer = new TensorBufferType("WebGpuBuffer", 15, 20);
                public static final TensorBufferType WebGpuBufferFp16 = new TensorBufferType("WebGpuBufferFp16", 16, 21);
                public static final TensorBufferType WebGpuTexture = new TensorBufferType("WebGpuTexture", 17, 22);
                public static final TensorBufferType WebGpuTextureFp16 = new TensorBufferType("WebGpuTextureFp16", 18, 23);
                public static final TensorBufferType WebGpuImageBuffer = new TensorBufferType("WebGpuImageBuffer", 19, 24);
                public static final TensorBufferType WebGpuImageBufferFp16 = new TensorBufferType("WebGpuImageBufferFp16", 20, 25);
                public static final TensorBufferType WebGpuBufferPacked = new TensorBufferType("WebGpuBufferPacked", 21, 26);
                public static final TensorBufferType VulkanBuffer = new TensorBufferType("VulkanBuffer", 22, 40);
                public static final TensorBufferType VulkanBufferFp16 = new TensorBufferType("VulkanBufferFp16", 23, 41);
                public static final TensorBufferType VulkanTexture = new TensorBufferType("VulkanTexture", 24, 42);
                public static final TensorBufferType VulkanTextureFp16 = new TensorBufferType("VulkanTextureFp16", 25, 43);
                public static final TensorBufferType VulkanImageBuffer = new TensorBufferType("VulkanImageBuffer", 26, 44);
                public static final TensorBufferType VulkanImageBufferFp16 = new TensorBufferType("VulkanImageBufferFp16", 27, 45);
                public static final TensorBufferType VulkanBufferPacked = new TensorBufferType("VulkanBufferPacked", 28, 46);

                private static final TensorBufferType[] $values() {
/* 59 */            return new TensorBufferType[]{Unknown, HostMemory, Ahwb, Ion, DmaBuf, FastRpc, GlBuffer, GlTexture, OpenClBuffer, OpenClBufferFp16, OpenClTexture, OpenClTextureFp16, OpenClBufferPacked, OpenClImageBuffer, OpenClImageBufferFp16, WebGpuBuffer, WebGpuBufferFp16, WebGpuTexture, WebGpuTextureFp16, WebGpuImageBuffer, WebGpuImageBufferFp16, WebGpuBufferPacked, VulkanBuffer, VulkanBufferFp16, VulkanTexture, VulkanTextureFp16, VulkanImageBuffer, VulkanImageBufferFp16, VulkanBufferPacked};
                }

                static {
/* 326 */           TensorBufferType[] tensorBufferTypeArr$values = $values();
/* 330 */           $VALUES = tensorBufferTypeArr$values;
/* 336 */           $ENTRIES = ilIII1o11.I00000oIO(tensorBufferTypeArr$values);
/* 344 */           INSTANCE = new Companion(null);
                }

                private TensorBufferType(String str, int i, int i2) {
/* 4 */             this.type = i2;
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static TensorBufferType valueOf(String str) {
/* 7 */             return (TensorBufferType) Enum.valueOf(TensorBufferType.class, str);
                }

                public static TensorBufferType[] values() {
/* 7 */             return (TensorBufferType[]) $VALUES.clone();
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/ai/edge/litert/TensorBufferType$Companion;", "", "<init>", "()V", "of", "Lcom/google/ai/edge/litert/TensorBufferType;", "type", "", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final TensorBufferType of(int type) {
                        TensorBufferType tensorBufferType;
/* 1 */                 TensorBufferType[] tensorBufferTypeArrValues = TensorBufferType.values();
/* 5 */                 int length = tensorBufferTypeArrValues.length;
/* 6 */                 int i = 0;
                        while (true) {
/* 7 */                     if (i >= length) {
/* 21 */                        tensorBufferType = null;
                                break;
                            }
/* 9 */                     tensorBufferType = tensorBufferTypeArrValues[i];
/* 15 */                    if (tensorBufferType.type == type) {
                                break;
                            }
/* 18 */                    i++;
                        }
                        return tensorBufferType == null ? TensorBufferType.Unknown : tensorBufferType;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
