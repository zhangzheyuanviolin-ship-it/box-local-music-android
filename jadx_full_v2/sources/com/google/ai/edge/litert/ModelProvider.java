            package com.google.ai.edge.litert;

            import com.google.ai.edge.litert.ModelProvider;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.I1IoiO1l;
            import p000.IOoil1iiIilo;
            import p000.Ii0110;
            import p000.Ii0111o;
            import p000.Ii1OliO0l;
            import p000.Il0lIli0;
            import p000.IlliIl1l11O;
            import p000.O0oiOi;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.ilIII1o11;
            import p000.l10O10;
            import p000.l10o1ollO;
            import p000.lIoii1l01l0i;
            
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/google/ai/edge/litert/ModelProvider;", "", "Lcom/google/ai/edge/litert/ModelProvider$Type;", "getType", "()Lcom/google/ai/edge/litert/ModelProvider$Type;", "", "isReady", "()Z", "", "getPath", "()Ljava/lang/String;", "", "Lcom/google/ai/edge/litert/Accelerator;", "getCompatibleAccelerators", "()Ljava/util/Set;", "LOoiIlOl1iI;", "download", "(LIOoil1iiIilo;)Ljava/lang/Object;", "LO0oiOi;", "lifecycleOwner", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "downloadFuture", "(LO0oiOi;)Lcom/google/common/util/concurrent/ListenableFuture;", "Companion", "Type", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface ModelProvider {

                public static final Companion INSTANCE = Companion.$$INSTANCE;

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/ai/edge/litert/ModelProvider$Companion;", "", "<init>", "()V", "staticModel", "Lcom/google/ai/edge/litert/ModelProvider;", "type", "Lcom/google/ai/edge/litert/ModelProvider$Type;", "path", "", "accelerators", "", "Lcom/google/ai/edge/litert/Accelerator;", "(Lcom/google/ai/edge/litert/ModelProvider$Type;Ljava/lang/String;[Lcom/google/ai/edge/litert/Accelerator;)Lcom/google/ai/edge/litert/ModelProvider;", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    static final Companion $$INSTANCE = new Companion();

                    private Companion() {
                    }

                    public final ModelProvider staticModel(final Type type, final String path, final Accelerator... accelerators) {
/* 3 */                 return new ModelProvider() {
                            @Override
                            public Object download(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */                         return OoiIlOl1iI.I00000oIO;
                            }

                            @Override
                            public Set<Accelerator> getCompatibleAccelerators() {
/* 1 */                         Accelerator[] acceleratorArr = accelerators;
                                return acceleratorArr.length == 0 ? Collections.singleton(Accelerator.CPU) : I1IoiO1l.I00IlilI0i0i(Arrays.copyOf(acceleratorArr, acceleratorArr.length));
                            }

                            @Override
                            public String get$path() {
/* 1 */                         return path;
                            }

                            @Override
                            public ModelProvider.Type get$type() {
/* 1 */                         return type;
                            }

                            @Override
                            public boolean isReady() {
/* 1 */                         return true;
                            }
                        };
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/ai/edge/litert/ModelProvider$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET", "FILE", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Type {
                    private static final Il0lIli0 $ENTRIES;
                    private static final Type[] $VALUES;
                    public static final Type ASSET = new Type("ASSET", 0);
                    public static final Type FILE = new Type("FILE", 1);

                    private static final Type[] $values() {
/* 5 */                 return new Type[]{ASSET, FILE};
                    }

                    static {
/* 21 */                Type[] typeArr$values = $values();
/* 25 */                $VALUES = typeArr$values;
/* 31 */                $ENTRIES = ilIII1o11.I00000oIO(typeArr$values);
                    }

                    private Type(String str, int i) {
                    }

                    public static Il0lIli0 getEntries() {
/* 1 */                 return $ENTRIES;
                    }

                    public static Type valueOf(String str) {
/* 7 */                 return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
/* 7 */                 return (Type[]) $VALUES.clone();
                    }
                }

                @Ii1OliO0l(m0c = "com.google.ai.edge.litert.ModelProvider$downloadFuture$1", m1f = "ModelProvider.kt", m2l = {55}, m3m = "invokeSuspend", m4v = 2)
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LIi0110;", "Ljava/lang/Void;", "<anonymous>", "(LIi0110;)Ljava/lang/Void;"}, m18k = 3, mv = {2, 3, 0})
                public static final class C00001 extends Oll0io implements IlliIl1l11O {
                    int label;

                    public C00001(IOoil1iiIilo iOoil1iiIilo) {
/* 4 */                 super(2, iOoil1iiIilo);
                    }

                    @Override
                    public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */                 return ModelProvider.this.new C00001(iOoil1iiIilo);
                    }

                    @Override
                    public final Object invoke(Ii0110 ii0110, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */                 return ((C00001) create(ii0110, iOoil1iiIilo)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */                 Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    ModelProvider modelProvider = ModelProvider.this;
/* 26 */                    this.label = 1;
/* 32 */                    if (modelProvider.download(this) == ii0111o) {
/* 34 */                        return ii0111o;
                            }
                        } else {
/* 9 */                     if (i != 1) {
/* 17 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 11 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 5 */                 return null;
                    }
                }

                static ModelProvider staticModel(Type type, String str, Accelerator... acceleratorArr) {
/* 3 */             return INSTANCE.staticModel(type, str, acceleratorArr);
                }

                Object download(IOoil1iiIilo iOoil1iiIilo);

                default ListenableFuture downloadFuture(O0oiOi lifecycleOwner) {
/* 15 */            return l10o1ollO.I00000oOI(l10O10.I00000oIO(lifecycleOwner.I000iOII()), new C00001(null));
                }

                Set<Accelerator> getCompatibleAccelerators();

                String get$path();

                Type get$type();

                boolean isReady();
            }
