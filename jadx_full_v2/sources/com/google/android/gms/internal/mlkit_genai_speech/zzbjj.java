            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.net.SocketAddress;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import java.util.regex.Pattern;
            import p000.I000II;
            import p000.IioIoO10iOiI;
            import p000.IlIi0I0;
            import p000.Oi010OO0;
            
            public final class zzbjj extends zzaxf {
                private static final Method zzt;
                zzbju zzd;
                final zzbju zze;
                zzayq zzf;
                final List zzg;
                final String zzh;
                IdentityHashMap zzi;
                final String zzj;
                final zzavi zzk;
                final zzaus zzl;
                long zzm;
                final zzavv zzn;
                final List zzo;
                private final List zzu;
                private final zzban zzv;
                private static final Logger zzp = Logger.getLogger(zzbjj.class.getName());
                static final long zza = 1800000;
                static final long zzb = 1000;
                private static final zzbju zzq = zzbne.zzc(zzbgr.zzi);
                private static final zzavi zzr = zzavi.zza();
                private static final zzaus zzs = zzaus.zza();
                static final Pattern zzc = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

                static {
/* 50 */            Method declaredMethod = null;
                    try {
/* 55 */                Class cls = Boolean.TYPE;
/* 61 */                declaredMethod = zzbck.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
                    } catch (ClassNotFoundException e) {
/* 96 */                zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
                    } catch (NoSuchMethodException e2) {
/* 82 */                zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
                    }
/* 99 */            zzt = declaredMethod;
                }

                public zzbjj(SocketAddress socketAddress, String str, zzaub zzaubVar, zzatv zzatvVar, zzban zzbanVar, zzbje zzbjeVar) {
/* 4 */             zzbju zzbjuVar = zzq;
/* 6 */             this.zzd = zzbjuVar;
/* 8 */             this.zze = zzbjuVar;
/* 15 */            this.zzu = new ArrayList();
/* 21 */            this.zzf = zzayq.zzb();
/* 28 */            this.zzg = new ArrayList();
/* 32 */            this.zzj = "pick_first";
/* 36 */            this.zzk = zzr;
/* 40 */            this.zzl = zzs;
/* 44 */            this.zzm = zza;
/* 50 */            this.zzn = zzavv.zza();
/* 57 */            this.zzo = new ArrayList();
/* 63 */            this.zzh = zzg(socketAddress);
/* 65 */            this.zzv = zzbanVar;
/* 69 */            zzayq zzayqVar = new zzayq();
/* 77 */            zzayqVar.zze(new zzbjg(socketAddress, str));
/* 80 */            this.zzf = zzayqVar;
/* 82 */            zzawa.zza(this);
                }

                public static zzbji zzb(String str, zzayq zzayqVar, Collection collection) {
                    URI uri;
/* 5 */             StringBuilder sb = new StringBuilder();
                    try {
/* 11 */                uri = new URI(str);
                    } catch (URISyntaxException e) {
/* 20 */                sb.append(e.getMessage());
/* 23 */                uri = null;
                    }
/* 35 */            zzaym zzaymVarZza = uri != null ? zzayqVar.zza(uri.getScheme()) : null;
/* 38 */            if (zzaymVarZza == null && !zzc.matcher(str).matches()) {
                        try {
/* 70 */                    uri = new URI(zzayqVar.zzc(), "", "/" + str, null);
/* 77 */                    zzaymVarZza = zzayqVar.zza(uri.getScheme());
                        } catch (URISyntaxException e2) {
/* 88 */                    throw new IllegalArgumentException(e2);
                        }
                    }
/* 89 */            if (zzaymVarZza == null) {
/* 120 */               throw new IllegalArgumentException(IlIi0I0.I000lI("Could not find a NameResolverProvider for ", str, sb.length() > 0 ? IlIi0I0.I000lI(" (", sb.toString(), ")") : ""));
                    }
/* 121 */           if (collection == null || collection.containsAll(zzaymVarZza.zzd())) {
/* 154 */               return new zzbji(uri, zzaymVarZza);
                    }
/* 148 */           I000II.I000iOII(Oi010OO0.I001IO000("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
/* 8 */             return null;
                }

                public static String zzg(SocketAddress socketAddress) {
                    try {
/* 29 */                return new URI("directaddress", "", "/" + socketAddress.toString(), null).toString();
                    } catch (URISyntaxException e) {
/* 35 */                IioIoO10iOiI.I000lI(e);
/* 3 */                 return null;
                    }
                }

                @Override
                public final zzaxd zza() {
                    zzauf zzaufVar;
/* 3 */             String str = this.zzh;
/* 7 */             zzbdp zzbdpVarZzh = this.zzv.zzh();
/* 19 */            zzbji zzbjiVarZzb = zzb(str, this.zzf, Collections.singleton(zzazq.class));
/* 23 */            URI uri = zzbjiVarZzb.zza;
/* 25 */            zzaym zzaymVar = zzbjiVarZzb.zzb;
/* 33 */            zzbfz zzbfzVar = new zzbfz();
/* 38 */            zzbne zzbneVarZzc = zzbne.zzc(zzbgr.zzi);
/* 42 */            zzgu zzguVar = zzbgr.zzk;
/* 44 */            uri.toString();
/* 47 */            List list = this.zzu;
/* 55 */            ArrayList arrayList = new ArrayList(list.size());
/* 58 */            Iterator it = list.iterator();
                    while (true) {
/* 66 */                zzauf zzaufVar2 = null;
/* 67 */                if (!it.hasNext()) {
/* 84 */                    zzawa.zzb();
/* 87 */                    Method method = zzt;
/* 89 */                    if (method != null) {
                                try {
/* 91 */                            Boolean bool = Boolean.TRUE;
/* 103 */                           zzaufVar = (zzauf) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                                } catch (IllegalAccessException e) {
/* 139 */                           zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                                } catch (InvocationTargetException e2) {
/* 124 */                           zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                                }
                            } else {
/* 127 */                       zzaufVar = null;
                            }
/* 144 */                   if (zzaufVar != null) {
/* 146 */                       arrayList.add(0, zzaufVar);
                            }
                            try {
/* 161 */                       zzaufVar2 = (zzauf) zzbcl.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                            } catch (ClassNotFoundException e3) {
/* 233 */                       zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                            } catch (IllegalAccessException e4) {
/* 205 */                       zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                            } catch (NoSuchMethodException e5) {
/* 219 */                       zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                            } catch (InvocationTargetException e6) {
/* 191 */                       zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                            }
/* 236 */                   if (zzaufVar2 != null) {
/* 238 */                       arrayList.add(0, zzaufVar2);
                            }
/* 246 */                   return new zzbjl(new zzbjd(this, zzbdpVarZzh, uri, zzaymVar, zzbfzVar, zzbneVarZzc, zzguVar, arrayList, zzbnl.zza));
                        }
/* 73 */                zzauf zzaufVar3 = (zzauf) it.next();
/* 77 */                if (zzaufVar3 instanceof zzbjh) {
/* 83 */                    throw null;
                        }
/* 79 */                arrayList.add(zzaufVar3);
                    }
                }

                public final zzbjj zzc(Executor executor) {
/* 6 */             this.zzd = new zzbgd(executor);
/* 29 */            return this;
                }

                public final zzbjj zzd(long j, TimeUnit timeUnit) {
/* 11 */            if (timeUnit.toDays(60L) >= 30) {
/* 15 */                this.zzm = -1L;
/* 17 */                return this;
                    }
/* 28 */            this.zzm = Math.max(timeUnit.toMillis(60L), zzb);
/* 37 */            return this;
                }

                public final zzbjj zze(zzayc zzaycVar, Object obj) {
/* 1 */             IdentityHashMap identityHashMap = this.zzi;
/* 3 */             if (identityHashMap == null) {
/* 7 */                 identityHashMap = new IdentityHashMap();
/* 10 */                this.zzi = identityHashMap;
                    }
/* 14 */            zzgo.zzc(obj, "value");
/* 17 */            identityHashMap.put(zzaycVar, obj);
/* 37 */            return this;
                }

                public final zzbju zzf() {
/* 1 */             return this.zze;
                }
            }
