            package com.google.ai.edge.litert;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.I1IoiO1l;
            import p000.IIlIOloOOO;
            import p000.IOoil1iiIilo;
            import p000.IOoilo;
            import p000.Ii0110;
            import p000.Ii0111o;
            import p000.Ii1OliO0l;
            import p000.IlliIl1l11O;
            import p000.O0oiOi;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.l10O10;
            import p000.l10o1ollO;
            import p000.lIoii1l01l0i;
            
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/ai/edge/litert/ModelSelector;", "", "", "Lcom/google/ai/edge/litert/ModelProvider;", "modelProviders", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/google/ai/edge/litert/ModelProvider;)V", "modelProvider", "ensureModelFileAvailable", "(Lcom/google/ai/edge/litert/ModelProvider;)Lcom/google/ai/edge/litert/ModelProvider;", "Lcom/google/ai/edge/litert/Environment;", "env", "selectModel", "(Lcom/google/ai/edge/litert/Environment;LIOoil1iiIilo;)Ljava/lang/Object;", "LO0oiOi;", "lifecycleOwner", "Lcom/google/common/util/concurrent/ListenableFuture;", "selectModelFuture", "(Lcom/google/ai/edge/litert/Environment;LO0oiOi;)Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/util/Set;", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 12 */    public final class ModelSelector {
                private static final String TAG = "ModelSelector";
                private final Set<ModelProvider> modelProviders;

                @Ii1OliO0l(m0c = "com.google.ai.edge.litert.ModelSelector", m1f = "ModelProvider.kt", m2l = {102, 117, 134}, m3m = "selectModel", m4v = 2)
                @Metadata(m18k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class C00011 extends IOoilo {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    Object result;

                    public C00011(IOoil1iiIilo iOoil1iiIilo) {
/* 3 */                 super(iOoil1iiIilo);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 this.result = obj;
                        this.label |= Integer.MIN_VALUE;
/* 13 */                return ModelSelector.this.selectModel(null, this);
                    }
                }

                @Ii1OliO0l(m0c = "com.google.ai.edge.litert.ModelSelector$selectModelFuture$1", m1f = "ModelProvider.kt", m2l = {154}, m3m = "invokeSuspend", m4v = 2)
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LIi0110;", "Lcom/google/ai/edge/litert/ModelProvider;", "<anonymous>", "(LIi0110;)Lcom/google/ai/edge/litert/ModelProvider;"}, m18k = 3, mv = {2, 3, 0})
                public static final class C00021 extends Oll0io implements IlliIl1l11O {
                    final Environment $env;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00021(Environment environment, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */                 super(2, iOoil1iiIilo);
/* 3 */                 this.$env = environment;
                    }

                    @Override
                    public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */                 return ModelSelector.this.new C00021(this.$env, iOoil1iiIilo);
                    }

                    @Override
                    public final Object invoke(Ii0110 ii0110, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */                 return ((C00021) create(ii0110, iOoil1iiIilo)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */                 Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */                 int i = this.label;
/* 6 */                 if (i != 0) {
/* 8 */                     if (i == 1) {
/* 10 */                        lIoii1l01l0i.I00000oOI(obj);
/* 13 */                        return obj;
                            }
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                ModelSelector modelSelector = ModelSelector.this;
/* 26 */                Environment environment = this.$env;
/* 28 */                this.label = 1;
/* 30 */                Object objSelectModel = modelSelector.selectModel(environment, this);
                        return objSelectModel == ii0111o ? ii0111o : objSelectModel;
                    }
                }

                public ModelSelector(ModelProvider... modelProviderArr) {
/* 10 */            this((Set<? extends ModelProvider>) I1IoiO1l.I00IlilI0i0i(Arrays.copyOf(modelProviderArr, modelProviderArr.length)));
                }

                private final ModelProvider ensureModelFileAvailable(ModelProvider modelProvider) {
/* 5 */             if (modelProvider.isReady()) {
/* 7 */                 return modelProvider;
                    }
/* 10 */            I000II.I001IO000("Model is not ready to be used yet.");
/* 13 */            return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
                
                    if (r14.download(r0) == r1) goto L92;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:107:0x014e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[PHI: r2 r13
                  0x00b9: PHI (r2v2 ??) = (r2v18 ??), (r2v19 ??), (r2v20 ??) binds: [B:48:0x00b0, B:38:0x008d, B:40:0x0095] A[DONT_GENERATE, DONT_INLINE]
                  0x00b9: PHI (r13v3 com.google.ai.edge.litert.ModelProvider) = 
                  (r13v32 com.google.ai.edge.litert.ModelProvider)
                  (r13v33 com.google.ai.edge.litert.ModelProvider)
                  (r13v34 com.google.ai.edge.litert.ModelProvider)
                 binds: [B:48:0x00b0, B:38:0x008d, B:40:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0162 A[Catch: IllegalStateException -> 0x0035, TryCatch #2 {IllegalStateException -> 0x0035, blocks: (B:14:0x0030, B:95:0x0173, B:88:0x015c, B:90:0x0162), top: B:100:0x0024 }] */
                /* JADX WARN: Type inference failed for: r12v0, types: [com.google.ai.edge.litert.ModelSelector] */
                /* JADX WARN: Type inference failed for: r13v0, types: [com.google.ai.edge.litert.Environment] */
                /* JADX WARN: Type inference failed for: r13v2 */
                /* JADX WARN: Type inference failed for: r13v22, types: [com.google.ai.edge.litert.ModelProvider] */
                /* JADX WARN: Type inference failed for: r13v29 */
                /* JADX WARN: Type inference failed for: r13v30 */
                /* JADX WARN: Type inference failed for: r13v31 */
                /* JADX WARN: Type inference failed for: r14v20 */
                /* JADX WARN: Type inference failed for: r14v21 */
                /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Set] */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v19 */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Set] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object selectModel(Environment environment, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    C00011 c00011;
                    ModelProvider modelProvider;
                    ?? r2;
                    ModelProvider modelProvider2;
                    Set set;
                    Object next;
                    ModelProvider modelProvider3;
                    Set set2;
                    ModelProvider modelProvider4;
                    IllegalStateException e;
                    Iterator it;
                    Object next2;
                    ModelProvider modelProvider5;
                    ModelProvider modelProvider6;
                    ModelProvider next3;
/* 3 */             if (iOoil1iiIilo instanceof C00011) {
/* 6 */                 c00011 = (C00011) iOoil1iiIilo;
/* 8 */                 int i = c00011.label;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c00011.label = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c00011 = new C00011(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = c00011.result;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = c00011.label;
                    try {
                        try {
                        } catch (IllegalStateException e2) {
/* 183 */                   IIlIOloOOO.I001iOo1i0O("Failed to download NPU model: ", e2.getMessage(), TAG);
                            r2 = i2;
                            modelProvider = environment;
                        }
                    } catch (IllegalStateException e3) {
/* 383 */               IIlIOloOOO.I001iOo1i0O("Failed to download CPU model: ", e3.getMessage(), TAG);
                    }
/* 37 */            if (i2 == 0) {
/* 97 */                lIoii1l01l0i.I00000oOI(obj);
/* 100 */               ?? availableAccelerators = environment.getAvailableAccelerators();
/* 108 */               Iterator it2 = this.modelProviders.iterator();
                        while (true) {
/* 116 */                   if (!it2.hasNext()) {
/* 138 */                       next3 = null;
                                break;
                            }
/* 118 */                   next3 = it2.next();
/* 135 */                   if (((ModelProvider) next3).getCompatibleAccelerators().contains(Accelerator.NPU)) {
                                break;
                            }
                        }
/* 140 */               ModelProvider modelProvider7 = next3;
                        r2 = availableAccelerators;
                        modelProvider = modelProvider7;
/* 142 */               if (modelProvider7 != null) {
/* 146 */                   boolean zContains = availableAccelerators.contains(Accelerator.NPU);
                            r2 = availableAccelerators;
                            modelProvider = modelProvider7;
/* 150 */                   if (!zContains) {
/* 186 */                       Set set3 = r2;
/* 187 */                       modelProvider2 = modelProvider;
/* 188 */                       set = set3;
/* 193 */                       Iterator it3 = this.modelProviders.iterator();
                                while (true) {
/* 201 */                           if (!it3.hasNext()) {
/* 229 */                               next = null;
                                        break;
                                    }
/* 203 */                           next = it3.next();
/* 208 */                           ModelProvider modelProvider8 = (ModelProvider) next;
/* 220 */                           if (modelProvider8.getCompatibleAccelerators().contains(Accelerator.GPU) && !modelProvider8.equals(modelProvider2)) {
                                        break;
                                    }
                                }
/* 231 */                       modelProvider3 = (ModelProvider) next;
/* 233 */                       if (modelProvider3 != null && set.contains(Accelerator.GPU)) {
                                    try {
/* 247 */                               if (!modelProvider3.isReady()) {
/* 249 */                                   c00011.L$0 = set;
/* 251 */                                   c00011.L$1 = modelProvider2;
/* 253 */                                   c00011.L$2 = modelProvider3;
/* 255 */                                   c00011.label = 2;
                                        }
/* 271 */                               set2 = set;
/* 272 */                               modelProvider4 = modelProvider3;
/* 273 */                               return this.ensureModelFileAvailable(modelProvider4);
                                    } catch (IllegalStateException e4) {
/* 267 */                               set2 = set;
/* 268 */                               modelProvider4 = modelProvider3;
/* 269 */                               e = e4;
/* 284 */                               IIlIOloOOO.I001iOo1i0O("Failed to download GPU model: ", e.getMessage(), TAG);
/* 287 */                               modelProvider3 = modelProvider4;
/* 288 */                               set = set2;
/* 293 */                               it = this.modelProviders.iterator();
                                        while (true) {
/* 301 */                                   if (!it.hasNext()) {
                                            }
                                        }
/* 337 */                               modelProvider5 = (ModelProvider) next2;
/* 339 */                               if (modelProvider5 != null) {
                                        }
/* 388 */                               I000II.I001IO000("No model is available.");
/* 36 */                                return null;
                                    }
                                }
/* 293 */                       it = this.modelProviders.iterator();
                                while (true) {
/* 301 */                           if (!it.hasNext()) {
/* 335 */                               next2 = null;
                                        break;
                                    }
/* 303 */                           next2 = it.next();
/* 308 */                           ModelProvider modelProvider9 = (ModelProvider) next2;
/* 320 */                           if (modelProvider9.getCompatibleAccelerators().contains(Accelerator.CPU) && !modelProvider9.equals(modelProvider2) && !modelProvider9.equals(modelProvider3)) {
                                        break;
                                    }
                                }
/* 337 */                       modelProvider5 = (ModelProvider) next2;
/* 339 */                       if (modelProvider5 != null && set.contains(Accelerator.CPU)) {
/* 353 */                           if (!modelProvider5.isReady()) {
/* 355 */                               c00011.L$0 = modelProvider5;
/* 357 */                               c00011.L$1 = null;
/* 359 */                               c00011.L$2 = null;
/* 361 */                               c00011.label = 3;
/* 367 */                               if (modelProvider5.download(c00011) != ii0111o) {
/* 370 */                                   modelProvider6 = modelProvider5;
/* 371 */                                   modelProvider5 = modelProvider6;
                                        }
                                    }
                                }
/* 388 */                       I000II.I001IO000("No model is available.");
/* 36 */                        return null;
                            }
/* 152 */                   boolean zIsReady = modelProvider7.isReady();
                            i2 = availableAccelerators;
                            environment = modelProvider7;
/* 156 */                   if (!zIsReady) {
/* 158 */                       c00011.L$0 = availableAccelerators;
/* 160 */                       c00011.L$1 = modelProvider7;
/* 162 */                       c00011.label = 1;
/* 164 */                       Object objDownload = modelProvider7.download(c00011);
                                i2 = availableAccelerators;
                                environment = modelProvider7;
/* 168 */                       if (objDownload == ii0111o) {
                                }
                            }
/* 369 */                   return ii0111o;
                        }
/* 372 */               return this.ensureModelFileAvailable(modelProvider5);
                    }
/* 39 */            if (i2 != 1) {
/* 41 */                if (i2 != 2) {
/* 43 */                    if (i2 != 3) {
/* 59 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                        return null;
                            }
/* 47 */                    modelProvider6 = (ModelProvider) c00011.L$0;
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 371 */                   modelProvider5 = modelProvider6;
/* 372 */                   return this.ensureModelFileAvailable(modelProvider5);
                        }
/* 65 */                modelProvider4 = (ModelProvider) c00011.L$2;
/* 69 */                modelProvider2 = (ModelProvider) c00011.L$1;
/* 73 */                set2 = (Set) c00011.L$0;
                        try {
/* 75 */                    lIoii1l01l0i.I00000oOI(obj);
/* 273 */                   return this.ensureModelFileAvailable(modelProvider4);
                        } catch (IllegalStateException e5) {
/* 80 */                    e = e5;
/* 284 */                   IIlIOloOOO.I001iOo1i0O("Failed to download GPU model: ", e.getMessage(), TAG);
/* 287 */                   modelProvider3 = modelProvider4;
/* 288 */                   set = set2;
/* 293 */                   it = this.modelProviders.iterator();
                            while (true) {
/* 301 */                       if (!it.hasNext()) {
                                }
                            }
/* 337 */                   modelProvider5 = (ModelProvider) next2;
/* 339 */                   if (modelProvider5 != null) {
/* 353 */                       if (!modelProvider5.isReady()) {
                                }
/* 372 */                       return this.ensureModelFileAvailable(modelProvider5);
                            }
/* 388 */                   I000II.I001IO000("No model is available.");
/* 36 */                    return null;
                        }
                    }
/* 85 */            ModelProvider modelProvider10 = (ModelProvider) c00011.L$1;
/* 89 */            ?? r22 = (Set) c00011.L$0;
/* 91 */            lIoii1l01l0i.I00000oOI(obj);
                    i2 = r22;
                    environment = modelProvider10;
/* 172 */           return ensureModelFileAvailable(environment);
                }

                public final ListenableFuture selectModelFuture(Environment env, O0oiOi lifecycleOwner) {
/* 15 */            return l10o1ollO.I00000oOI(l10O10.I00000oIO(lifecycleOwner.I000iOII()), new C00021(env, null));
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 13 */        public ModelSelector(Set<? extends ModelProvider> set) {
                    this.modelProviders = set;
                }
            }
