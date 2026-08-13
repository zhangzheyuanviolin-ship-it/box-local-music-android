            package com.google.mlkit.genai.prompt.java;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import p000.IIiOOI;
            import p000.IIiOOIoi0;
            import p000.Ii0110;
            import p000.Il11ooO1o;
            import p000.OlIl0i;
            import p000.iOi1II01i0;
            import p000.iOiiloIII0O;
            import p000.il001oo1;
            
/* 9 */     public final class zzal extends GenerativeModelFutures {
                private final GenerativeModel zza;
                private final Ii0110 zzb;

                public zzal(GenerativeModel generativeModel) {
/* 4 */             this.zza = generativeModel;
/* 19 */            this.zzb = il001oo1.I00000oIO(new Il11ooO1o(generativeModel.zzf()));
                }

                public static Object zzb(zzal zzalVar, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzai(iIiOOI, zzalVar, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "getBaseModelName";
                }

                public static Object zzc(zzal zzalVar, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzad(iIiOOI, zzalVar, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "checkStatus";
                }

                public static Object zzd(zzal zzalVar, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzaj(iIiOOI, zzalVar, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "isSystemPromptAvailable";
                }

                public static Object zze(zzal zzalVar, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzak(iIiOOI, zzalVar, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "isThinkingModeAvailable";
                }

                public static Object zzf(zzal zzalVar, GenerateContentRequest generateContentRequest, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzae(iIiOOI, zzalVar, generateContentRequest, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "generateContent";
                }

                public static Object zzg(zzal zzalVar, GenerateContentRequest generateContentRequest, StreamingCallback streamingCallback, IIiOOI iIiOOI) {
/* 15 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzaf(iIiOOI, zzalVar, generateContentRequest, streamingCallback, null), 3);
/* 30 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 33 */            return "generateContentStream";
                }

                public static Object zzh(zzal zzalVar, String str, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzag(iIiOOI, zzalVar, str, null), 3);
/* 25 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 28 */            return "generateContent";
                }

                public static Object zzi(zzal zzalVar, String str, StreamingCallback streamingCallback, IIiOOI iIiOOI) {
/* 15 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzalVar.zzb, null, null, new zzah(iIiOOI, zzalVar, str, streamingCallback, null), 3);
/* 30 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzalVar.zza.zzf());
/* 33 */            return "generateContentStream";
                }

                @Override
                public final ListenableFuture checkStatus() {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */                     return zzal.zzc(this.zza, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture clearImplicitCaches() {
/* 3 */             return this.zza.zze();
                }

                @Override
                public final ListenableFuture countTokens(GenerateContentRequest generateContentRequest) {
/* 3 */             return this.zza.zzc(generateContentRequest);
                }

                @Override
                public final ListenableFuture download(DownloadCallback downloadCallback) {
/* 3 */             return this.zza.zza(downloadCallback);
                }

                @Override
                public final ListenableFuture generateContent(final GenerateContentRequest generateContentRequest) {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */                     return zzal.zzf(this.zza, generateContentRequest, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture getBaseModelName() {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */                     return zzal.zzb(this.zza, iIiOOI);
                        }
                    });
                }

                @Override
                public final GenerativeModel getGenerativeModel() {
/* 1 */             return this.zza;
                }

                @Override
                public final ListenableFuture getTokenLimit() {
/* 3 */             return this.zza.zzd();
                }

                @Override
                public final ListenableFuture isSystemPromptAvailable() {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */                     return zzal.zzd(this.zza, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture isThinkingModeAvailable() {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */                     return zzal.zze(this.zza, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture warmup() {
/* 3 */             return this.zza.zzb();
                }

                @Override
/* 10 */        public final ListenableFuture generateContent(final GenerateContentRequest generateContentRequest, final StreamingCallback streamingCallback) {
/* 11 */            return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 7 */                     return zzal.zzg(this.zza, generateContentRequest, streamingCallback, iIiOOI);
                        }
                    });
                }

                @Override
/* 11 */        public final ListenableFuture generateContent(final String str) {
/* 12 */            return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */                     return zzal.zzh(this.zza, str, iIiOOI);
                        }
                    });
                }

                @Override
/* 12 */        public final ListenableFuture generateContent(final String str, final StreamingCallback streamingCallback) {
/* 13 */            return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 7 */                     return zzal.zzi(this.zza, str, streamingCallback, iIiOOI);
                        }
                    });
                }
            }
