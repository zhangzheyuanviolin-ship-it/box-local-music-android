            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.net.InetAddress;
            import java.net.InetSocketAddress;
            import java.net.URI;
            import java.net.UnknownHostException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Random;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IioIoO10iOiI;
            
            public final class zzbfx extends zzayl {
                static final boolean zzb;
                static final boolean zzc;
                protected static final boolean zzd;
                private static final Logger zzh;
                private static final Set zzi;
                private static final String zzj;
                private static final String zzk;
                private static final String zzl;
                private static final zzbfv zzm;
                private static String zzn;
                private boolean zzA;
                private zzayg zzB;
                final zzayu zze;
                protected boolean zzg;
                private final String zzq;
                private final String zzr;
                private final int zzs;
                private final zzbju zzt;
                private final long zzu;
                private final zzazm zzv;
                private final zzayj zzw;
                private final zzgs zzx;
                private boolean zzy;
                private Executor zzz;
                private final Random zzo = new Random();
                protected volatile zzbfm zzf = zzbfo.INSTANCE;
                private final AtomicReference zzp = new AtomicReference();

                static {
/* 7 */             Logger logger = Logger.getLogger(zzbfx.class.getName());
/* 11 */            zzh = logger;
/* 38 */            zzi = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
/* 44 */            String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
/* 48 */            zzj = property;
/* 54 */            String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
/* 58 */            zzk = property2;
/* 62 */            String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
/* 66 */            zzl = property3;
/* 72 */            zzb = Boolean.parseBoolean(property);
/* 78 */            zzc = Boolean.parseBoolean(property2);
/* 84 */            zzd = Boolean.parseBoolean(property3);
/* 90 */            zzbfv zzbfvVar = null;
                    try {
                        try {
                            try {
/* 112 */                       zzbfv zzbfvVar2 = (zzbfv) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzbfx.class.getClassLoader()).asSubclass(zzbfv.class).getConstructor(null).newInstance(null);
/* 118 */                       if (zzbfvVar2.zzb() != null) {
/* 132 */                           logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzbfvVar2.zzb());
                                } else {
/* 136 */                           zzbfvVar = zzbfvVar2;
                                }
                            } catch (Exception e) {
/* 150 */                       zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                            }
                        } catch (Exception e2) {
/* 166 */                   zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
                        }
                    } catch (ClassCastException e3) {
/* 186 */               zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
                    } catch (ClassNotFoundException e4) {
/* 200 */               zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
                    }
/* 203 */           zzm = zzbfvVar;
                }

                public zzbfx(String str, String str2, zzayd zzaydVar, zzbnc zzbncVar, zzgs zzgsVar, boolean z) throws NumberFormatException {
/* 24 */            zzgo.zzc(zzaydVar, "args");
/* 29 */            zzgo.zzc(str2, "name");
/* 38 */            URI uriCreate = URI.create("//".concat(str2));
/* 53 */            zzgo.zzj(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
/* 56 */            String authority = uriCreate.getAuthority();
/* 62 */            zzgo.zzd(authority, "nameUri (%s) doesn't have an authority", uriCreate);
/* 65 */            this.zzq = authority;
/* 71 */            this.zzr = uriCreate.getHost();
/* 78 */            if (uriCreate.getPort() == -1) {
/* 84 */                this.zzs = zzaydVar.zza();
                    } else {
/* 91 */                this.zzs = uriCreate.getPort();
                    }
/* 97 */            this.zze = zzaydVar.zzd();
/* 99 */            Executor executorZzg = zzaydVar.zzg();
/* 103 */           if (executorZzg != null) {
/* 110 */               this.zzt = new zzbgd(executorZzg);
                    } else {
/* 117 */               this.zzt = zzbne.zzc(zzbncVar);
                    }
/* 119 */           long nanos = 0;
/* 121 */           if (!z) {
/* 126 */               String property = System.getProperty("networkaddress.cache.ttl");
/* 130 */               long j = 30;
/* 132 */               if (property != null) {
                            try {
/* 134 */                       j = Long.parseLong(property);
                            } catch (NumberFormatException unused) {
/* 157 */                       zzh.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                            }
                        }
/* 171 */               nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
                    }
/* 172 */           this.zzu = nanos;
/* 174 */           this.zzx = zzgsVar;
/* 180 */           this.zzv = zzaydVar.zze();
/* 186 */           this.zzw = zzaydVar.zzc();
                }

                public static zzavj zzg(zzbfx zzbfxVar) {
/* 11 */            zzayt zzaytVarZza = zzbfxVar.zze.zza(InetSocketAddress.createUnresolved(zzbfxVar.zzr, zzbfxVar.zzs));
/* 15 */            if (zzaytVarZza == null) {
/* 29 */                return null;
                    }
/* 25 */            return new zzavj(Collections.singletonList(zzaytVarZza), zzatu.zza);
                }

                private static String zzm() {
/* 1 */             String str = zzn;
/* 3 */             if (str != null) {
/* 55 */                return str;
                    }
                    try {
/* 9 */                 String hostName = InetAddress.getLocalHost().getHostName();
/* 13 */                zzn = hostName;
/* 15 */                return hostName;
                    } catch (UnknownHostException e) {
/* 17 */                IioIoO10iOiI.I000lI(e);
/* 20 */                return null;
                    }
                }

                private final void zzn() {
/* 3 */             if (this.zzA || this.zzy) {
/* 55 */                return;
                    }
/* 11 */            if (this.zzg) {
/* 13 */                long j = this.zzu;
/* 19 */                if (j != 0 && (j <= 0 || this.zzx.zza(TimeUnit.NANOSECONDS) <= j)) {
/* 55 */                    return;
                        }
                    }
/* 36 */            this.zzA = true;
/* 47 */            this.zzz.execute(new zzbft(this, this.zzB));
                }

                @Override
                public final String zza() {
/* 1 */             return this.zzq;
                }

                @Override
                public final void zzb() {
/* 10 */            zzgo.zzn(this.zzB != null, "not started");
/* 13 */            zzn();
                }

                @Override
                public final void zzc() {
/* 3 */             if (this.zzy) {
/* 55 */                return;
                    }
/* 7 */             this.zzy = true;
/* 9 */             Executor executor = this.zzz;
/* 11 */            if (executor != null) {
/* 15 */                this.zzt.zzb(executor);
/* 19 */                this.zzz = null;
                    }
                }

                @Override
                public final void zzd(zzayg zzaygVar) {
/* 10 */            zzgo.zzn(this.zzB == null, "already started");
/* 21 */            this.zzz = (Executor) this.zzt.zza();
/* 23 */            this.zzB = zzaygVar;
/* 25 */            zzn();
                }

                /* JADX WARN: Removed duplicated region for block: B:143:0x01d6 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:146:? A[LOOP:2: B:64:0x012c->B:146:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0190 A[Catch: RuntimeException -> 0x015c, TryCatch #3 {RuntimeException -> 0x015c, blocks: (B:67:0x0138, B:68:0x0140, B:70:0x0146, B:73:0x015f, B:75:0x0167, B:77:0x016d, B:78:0x0171, B:80:0x0177, B:84:0x0188, B:86:0x0190, B:91:0x019d, B:94:0x01a9, B:96:0x01b1, B:98:0x01b7, B:99:0x01bb, B:101:0x01c1, B:103:0x01cd, B:108:0x01d7, B:109:0x01e6), top: B:131:0x0138 }] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x01a9 A[Catch: RuntimeException -> 0x015c, TryCatch #3 {RuntimeException -> 0x015c, blocks: (B:67:0x0138, B:68:0x0140, B:70:0x0146, B:73:0x015f, B:75:0x0167, B:77:0x016d, B:78:0x0171, B:80:0x0177, B:84:0x0188, B:86:0x0190, B:91:0x019d, B:94:0x01a9, B:96:0x01b1, B:98:0x01b7, B:99:0x01bb, B:101:0x01c1, B:103:0x01cd, B:108:0x01d7, B:109:0x01e6), top: B:131:0x0138 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final zzbfn zzi(boolean z) {
                    zzbfu zzbfuVarZza;
                    zzbfv zzbfvVar;
                    zzaye zzayeVarZzb;
                    Double dZzb;
/* 7 */             zzaye zzayeVarZzb2 = null;
/* 8 */             zzbfn zzbfnVar = new zzbfn(null);
                    try {
/* 21 */                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(this.zzr)));
/* 31 */                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
/* 34 */                Iterator it = listUnmodifiableList.iterator();
/* 42 */                while (it.hasNext()) {
/* 68 */                    arrayList.add(new zzavj(Collections.singletonList(new InetSocketAddress((InetAddress) it.next(), this.zzs)), zzatu.zza));
                        }
/* 1 */                 zzbfnVar.zzb = Collections.unmodifiableList(arrayList);
/* 85 */                if (zzd) {
/* 87 */                    String str = this.zzr;
/* 89 */                    List<String> listZza = Collections.EMPTY_LIST;
/* 91 */                    boolean z2 = zzb;
/* 93 */                    boolean z3 = zzc;
/* 97 */                    if (z2) {
/* 107 */                       if (!"localhost".equalsIgnoreCase(str)) {
/* 118 */                           if (!str.contains(":")) {
/* 121 */                               boolean z4 = true;
/* 127 */                               for (int i = 0; i < str.length(); i++) {
/* 129 */                                   char cCharAt = str.charAt(i);
/* 135 */                                   if (cCharAt != '.') {
/* 148 */                                       z4 &= cCharAt >= '0' && cCharAt <= '9';
                                            }
                                        }
/* 152 */                               if (z4) {
                                        }
                                    }
/* 99 */                            zzbfuVarZza = null;
                                } else if (z3) {
/* 161 */                           zzbfuVarZza = (zzbfu) this.zzp.get();
/* 163 */                           if (zzbfuVarZza == null && (zzbfvVar = zzm) != null) {
/* 169 */                               zzbfuVarZza = zzbfvVar.zza();
                                    }
                                } else {
/* 99 */                            zzbfuVarZza = null;
                                }
/* 173 */                       if (zzbfuVarZza != null) {
                                    try {
/* 175 */                               listZza = zzbfuVarZza.zza();
                                    } catch (Exception e) {
/* 192 */                               zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e);
                                    }
                                }
/* 199 */                       if (listZza.isEmpty()) {
/* 576 */                           zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{this.zzr});
                                } else {
/* 201 */                           Random random = this.zzo;
/* 203 */                           String strZzm = zzm();
                                    try {
/* 209 */                               ArrayList arrayList2 = new ArrayList();
/* 220 */                               for (String str2 : listZza) {
/* 234 */                                   if (str2.startsWith("grpc_config=")) {
/* 263 */                                       Object objZza = zzbhq.zza(str2.substring(12));
/* 269 */                                       if (!(objZza instanceof List)) {
/* 295 */                                           throw new ClassCastException("wrong type ".concat(String.valueOf(objZza)));
                                                }
/* 271 */                                       List list = (List) objZza;
/* 273 */                                       zzbhr.zzf(list);
/* 276 */                                       arrayList2.addAll(list);
                                            } else {
/* 250 */                                       zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
                                            }
                                        }
/* 296 */                               Iterator it2 = arrayList2.iterator();
/* 300 */                               Map map = null;
/* 305 */                               while (it2.hasNext()) {
/* 311 */                                   Map map2 = (Map) it2.next();
                                            try {
/* 325 */                                       for (Map.Entry entry : map2.entrySet()) {
/* 345 */                                           zzgy.zza(zzi.contains(entry.getKey()), "Bad key: %s", entry);
                                                }
/* 354 */                                       List listZzi = zzbhr.zzi(map2, "clientLanguage");
/* 358 */                                       if (listZzi == null || listZzi.isEmpty()) {
/* 395 */                                           dZzb = zzbhr.zzb(map2, "percentage");
/* 399 */                                           if (dZzb == null) {
/* 428 */                                               List listZzi2 = zzbhr.zzi(map2, "clientHostname");
/* 432 */                                               if (listZzi2 != null && !listZzi2.isEmpty()) {
/* 440 */                                                   Iterator it3 = listZzi2.iterator();
/* 448 */                                                   while (it3.hasNext()) {
/* 460 */                                                       if (((String) it3.next()).equals(strZzm)) {
                                                                }
                                                            }
/* 391 */                                                   map = null;
/* 469 */                                                   if (map == null) {
                                                                break;
                                                            }
                                                        }
/* 462 */                                               Map mapZzj = zzbhr.zzj(map2, "serviceConfig");
/* 466 */                                               if (mapZzj == null) {
/* 487 */                                                   throw new zzgz(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                        }
/* 468 */                                               map = mapZzj;
/* 469 */                                               if (map == null) {
                                                        }
                                                    } else {
/* 401 */                                               int iIntValue = dZzb.intValue();
/* 416 */                                               zzgy.zza(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dZzb);
/* 423 */                                               if (random.nextInt(100) >= iIntValue) {
                                                        }
/* 391 */                                               map = null;
/* 469 */                                               if (map == null) {
                                                        }
                                                    }
                                                } else {
/* 366 */                                           Iterator it4 = listZzi.iterator();
/* 374 */                                           while (it4.hasNext()) {
/* 388 */                                               if ("java".equalsIgnoreCase((String) it4.next())) {
/* 395 */                                                   dZzb = zzbhr.zzb(map2, "percentage");
/* 399 */                                                   if (dZzb == null) {
                                                            }
                                                        }
                                                    }
/* 391 */                                           map = null;
/* 469 */                                           if (map == null) {
                                                    }
                                                }
                                            } catch (RuntimeException e2) {
/* 500 */                                       zzayeVarZzb = zzaye.zzb(zzazd.zzc.zze("failed to pick service config choice").zzd(e2));
                                            }
                                        }
/* 509 */                               zzayeVarZzb = map == null ? null : zzaye.zza(map);
                                    } catch (IOException | RuntimeException e3) {
/* 526 */                               zzayeVarZzb = zzaye.zzb(zzazd.zzc.zze("failed to parse TXT records").zzd(e3));
                                    }
/* 530 */                           if (zzayeVarZzb != null) {
/* 555 */                               zzayeVarZzb2 = zzayeVarZzb.zzc() != null ? zzaye.zzb(zzayeVarZzb.zzc()) : this.zzw.zza((Map) zzayeVarZzb.zzd());
                                    }
                                }
/* 1 */                         zzbfnVar.zzc = zzayeVarZzb2;
                            }
                        }
/* 582 */               return zzbfnVar;
                    } catch (Exception e4) {
/* 593 */               zzh.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (Throwable) e4);
/* 1 */                 zzbfnVar.zza = zzazd.zzj.zze("Unable to resolve host ".concat(String.valueOf(this.zzr))).zzd(e4);
/* 1261 */              return zzbfnVar;
                    }
                }
            }
