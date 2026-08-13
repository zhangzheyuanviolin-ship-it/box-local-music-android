            package com.google.mlkit.genai.prompt.java;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.prompt.Caches;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import java.util.concurrent.ExecutorService;
            import p000.IIiOOI;
            import p000.IIiOOIoi0;
            import p000.Ii0110;
            import p000.Il11ooO1o;
            import p000.OlIl0i;
            import p000.iOi1II01i0;
            import p000.iOiiloIII0O;
            import p000.il001oo1;
            
            public final class zzm extends CachesFutures {
                private final GenerativeModel zza;
                private final Caches zzb;
                private final Ii0110 zzc;
                private final ExecutorService zzd;

                public zzm(GenerativeModel generativeModel) {
/* 4 */             this.zza = generativeModel;
/* 10 */            this.zzb = generativeModel.getCaches();
/* 25 */            this.zzc = il001oo1.I00000oIO(new Il11ooO1o(generativeModel.zzf()));
/* 31 */            this.zzd = generativeModel.zzf();
                }

                public static Object zzb(zzm zzmVar, CreateCachedContextRequest createCachedContextRequest, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzmVar.zzc, null, null, new zzi(iIiOOI, zzmVar, createCachedContextRequest, null), 3);
/* 21 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzmVar.zzd);
/* 24 */            return "create";
                }

                public static Object zzc(zzm zzmVar, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzmVar.zzc, null, null, new zzl(iIiOOI, zzmVar, null), 3);
/* 21 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzmVar.zzd);
/* 24 */            return "list";
                }

                public static Object zzd(zzm zzmVar, String str, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzmVar.zzc, null, null, new zzk(iIiOOI, zzmVar, str, null), 3);
/* 21 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzmVar.zzd);
/* 24 */            return "get";
                }

                public static Object zze(zzm zzmVar, String str, IIiOOI iIiOOI) {
/* 10 */            final OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(zzmVar.zzc, null, null, new zzj(iIiOOI, zzmVar, str, null), 3);
/* 21 */            iIiOOI.I00000oIO(new Runnable() {
                        @Override
                        public final void run() {
/* 4 */                     olIl0iI0000O.I000II(null);
                        }
                    }, zzmVar.zzd);
/* 24 */            return "delete";
                }

                @Override
                public final ListenableFuture create(final CreateCachedContextRequest createCachedContextRequest) {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */                     return zzm.zzb(this.zza, createCachedContextRequest, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture delete(final String str) {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */                     return zzm.zze(this.zza, str, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture get(final String str) {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */                     return zzm.zzd(this.zza, str, iIiOOI);
                        }
                    });
                }

                @Override
                public final ListenableFuture list() {
/* 6 */             return iOiiloIII0O.I00000oIO(new IIiOOIoi0() {
                        @Override
                        public final Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */                     return zzm.zzc(this.zza, iIiOOI);
                        }
                    });
                }
            }
