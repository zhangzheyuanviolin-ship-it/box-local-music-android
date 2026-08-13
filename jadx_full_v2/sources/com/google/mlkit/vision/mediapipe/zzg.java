            package com.google.mlkit.vision.mediapipe;

            import android.util.Log;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhk;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.research.xeno.effect.AssetRegistry;
            import com.google.research.xeno.effect.AssetRegistryService;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.O1o01iO0liI0;
            import p000.OloIlI0ll;
            import p000.ill1iI;
            import p000.ioiioIi0i0ol;
            import p000.iololOIIO;
            import p000.iooIolo0o0;
            import p000.l0011i10;
            import p000.l00I10oOii;
            import p000.l11ll1Oo;
            import p000.l1I0oI;
            import p000.lI0011loIOIo;
            import p000.lI1IliiIoIi;
            import p000.lII0I0I000I;
            import p000.lIi0II001O1I;
            import p000.lO1Ilo0lloiO;
            import p000.lOio0o;
            
            public final class zzg {
                public static final int zza = 0;
                private static final String zzb = "zzg";
                private final MediaPipeGraphRunnerConfig zzc;
                private zzhp zzd;
                private zzhl zze;
                private final AtomicBoolean zzf = new AtomicBoolean(false);
                private long zzg = -1;
                private ConcurrentHashMap zzh;

                static {
                    try {
/* 1 */                 l1I0oI.I0010o();
/* 6 */                 System.loadLibrary("xeno_native");
                    } catch (UnsatisfiedLinkError e) {
/* 15 */                Log.e(zzb, "Failed to load JNI: ", e);
                    }
                }

                public zzg(MediaPipeGraphRunnerConfig mediaPipeGraphRunnerConfig) {
/* 4 */             this.zzc = mediaPipeGraphRunnerConfig;
                }

                private final void zzg() {
/* 1 */             zzhp zzhpVar = this.zzd;
/* 3 */             lII0I0I000I.I000II(zzhpVar);
/* 6 */             zzhpVar.zzk();
/* 9 */             zzhp zzhpVar2 = this.zzd;
/* 11 */            lII0I0I000I.I000II(zzhpVar2);
/* 14 */            zzhpVar2.zzn();
                }

                public final Object zza(List list, Converter converter) throws Throwable {
/* 3 */             OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 8 */             zze zzeVar = new zze(this, oloIlI0ll, converter);
/* 15 */            if (this.zzd == null) {
/* 332 */               throw new O1o01iO0liI0("Couldn't send input frame. Possible reason: load() hasn't been called yet.", 13);
                    }
/* 24 */            if (!this.zzf.getAndSet(true)) {
/* 26 */                zzg();
                    }
/* 49 */            lII0I0I000I.I00000oOI(list.size() == this.zzc.zzc().size());
/* 52 */            int i = 0;
/* 59 */            while (i < list.size() - 1) {
/* 67 */                long jZza = ((MediaPipeInput) list.get(i)).zza();
/* 71 */                i++;
/* 92 */                lII0I0I000I.I00000oIO("MediaPipeInputs doesn't have same timestamp.", jZza == ((MediaPipeInput) list.get(i)).zza());
                    }
/* 102 */           long jZza2 = ((MediaPipeInput) list.get(0)).zza();
/* 112 */           this.zzh.put(Long.valueOf(jZza2), zzeVar);
/* 119 */           for (int i2 = 0; i2 < list.size(); i2++) {
/* 129 */               zzhv zzhvVarZzb = ((MediaPipeInput) list.get(i2)).zzb(this.zze);
                        try {
/* 137 */                   if (jZza2 <= this.zzg) {
/* 196 */                       throw new O1o01iO0liI0("Timestamp must be monotonically increasing. Last timestampUs: " + this.zzg + ", Current: " + jZza2, 13);
                            }
/* 139 */                   zzhp zzhpVar = this.zzd;
/* 141 */                   lII0I0I000I.I000II(zzhpVar);
/* 156 */                   zzhpVar.zzc((String) this.zzc.zzc().get(i2), zzhvVarZzb, jZza2);
                        } catch (zzhu e) {
/* 197 */                   zzhvVarZzb.zze();
/* 204 */                   Log.e(zzb, "Mediapipe error: ", e);
/* 213 */                   this.zzh.remove(Long.valueOf(jZza2));
/* 220 */                   String strValueOf = String.valueOf(e.getMessage());
/* 224 */                   OloIlI0ll oloIlI0ll2 = zzeVar.zza;
/* 230 */                   String strConcat = "Mediapipe failed with message: ".concat(strValueOf);
/* 237 */                   oloIlI0ll2.I00000oIO(new Exception(strConcat));
/* 245 */                   throw new O1o01iO0liI0(strConcat, 13);
                        }
                    }
/* 252 */           l11ll1Oo.I000O01llI0("From creating image packet to addConsumablePacketToInputStream").I000II(jZza2);
/* 255 */           this.zzg = jZza2;
                    try {
/* 259 */               return lOio0o.I00000oIO(oloIlI0ll.I00000oIO);
                    } catch (InterruptedException | ExecutionException e2) {
/* 267 */               String message = e2.getMessage();
/* 271 */               if (message == null) {
/* 273 */                   message = "";
                        }
/* 278 */               throw new O1o01iO0liI0(message, 13);
                    }
                }

                public final void zzc() {
                    String str;
/* 14 */            if (this.zzf.getAndSet(false)) {
                        try {
/* 16 */                    l1I0oI.I0010o();
/* 19 */                    l1I0oI.I0010o();
/* 28 */                    if (Boolean.parseBoolean("")) {
/* 32 */                        zzhp zzhpVar = this.zzd;
/* 34 */                        lII0I0I000I.I000II(zzhpVar);
/* 41 */                        ArrayList arrayListI00000oIO = zzhpVar.zzb().I00000oIO();
/* 50 */                        Collections.sort(arrayListI00000oIO, new Comparator() {
                                    @Override
                                    public final int compare(Object obj, Object obj2) {
/* 5 */                                 int i = zzg.zza;
/* 15 */                                return ((ioiioIi0i0ol) obj).I00100l0().compareTo(((ioiioIi0i0ol) obj2).I00100l0());
                                    }
                                });
/* 53 */                        Iterator it = arrayListI00000oIO.iterator();
/* 57 */                        long j = 0;
/* 59 */                        long jI00100o1O0lo = 0;
/* 64 */                        while (it.hasNext()) {
/* 70 */                            ioiioIi0i0ol ioiioii0i0ol = (ioiioIi0i0ol) it.next();
/* 80 */                            if (ioiioii0i0ol.I000oI1ioi().I000o00OoI0I() > 0 && ioiioii0i0ol.I000oI1ioi().I000oI1ioi() > 0) {
/* 102 */                               jI00100o1O0lo += ioiioii0i0ol.I000oI1ioi().I00100o1O0lo();
                                    }
                                }
/* 107 */                       String strConcat = "\n\t\t\t\tPercent\tCount\tAvgProcessUs\n--------------------------------------------------------------------";
/* 109 */                       Iterator it2 = arrayListI00000oIO.iterator();
/* 117 */                       while (it2.hasNext()) {
/* 123 */                           ioiioIi0i0ol ioiioii0i0ol2 = (ioiioIi0i0ol) it2.next();
/* 150 */                           String str2 = strConcat + "\n" + ioiioii0i0ol2.I00100l0() + ":\n\t\t\t\t";
/* 162 */                           if (ioiioii0i0ol2.I000oI1ioi().I000o00OoI0I() <= 0 || ioiioii0i0ol2.I000oI1ioi().I000oI1ioi() <= j) {
/* 249 */                               str = "---";
                                    } else {
/* 193 */                               lII0I0I000I.I000OiO(ioiioii0i0ol2.I000oI1ioi().I00100l0() == 1);
/* 200 */                               long jI00100o1O0lo2 = ioiioii0i0ol2.I000oI1ioi().I00100o1O0lo();
/* 208 */                               long jI000oI1ioi = ioiioii0i0ol2.I000oI1ioi().I000oI1ioi();
/* 212 */                               Locale locale = Locale.US;
/* 240 */                               str = ((100 * jI00100o1O0lo2) / jI00100o1O0lo) + "\t" + jI000oI1ioi + "\t" + (jI00100o1O0lo2 / jI000oI1ioi);
                                    }
/* 251 */                           strConcat = str2.concat(str);
/* 245 */                           j = 0;
                                }
/* 256 */                       l1I0oI.I0010o();
                            }
/* 259 */                   zzhp zzhpVar2 = this.zzd;
/* 261 */                   lII0I0I000I.I000II(zzhpVar2);
/* 264 */                   zzhpVar2.zzf();
/* 267 */                   zzhp zzhpVar3 = this.zzd;
/* 269 */                   lII0I0I000I.I000II(zzhpVar3);
/* 272 */                   zzhpVar3.zzm();
                        } catch (zzhu e) {
/* 278 */                   Log.e(zzb, "Mediapipe error: ", e);
                        }
                        try {
/* 281 */                   zzhp zzhpVar4 = this.zzd;
/* 283 */                   lII0I0I000I.I000II(zzhpVar4);
/* 286 */                   zzhpVar4.zzl();
                        } catch (zzhu e2) {
/* 293 */                   Log.e(zzb, "Mediapipe error: ", e2);
                        }
                    }
                }

                public final void zzd() throws O1o01iO0liI0, IOException {
/* 1 */             String str = "";
                    try {
/* 15 */                zzhk.zza(this.zzc.zza().I00000oOI());
                        try {
                            try {
/* 38 */                        InputStream inputStreamOpen = this.zzc.zza().I00000oOI().getAssets().open(this.zzc.zzb());
/* 42 */                        byte[] bArrI00000oIO = ill1iI.I00000oIO(inputStreamOpen);
/* 46 */                        inputStreamOpen.close();
/* 49 */                        lI0011loIOIo li0011loioio = lI0011loIOIo.I00000oOI;
/* 51 */                        lO1Ilo0lloiO lo1ilo0lloio = lO1Ilo0lloiO.I0000Il00O;
/* 55 */                        iooIolo0o0 iooiolo0o0I000o00OoI0I = iooIolo0o0.I000o00OoI0I(bArrI00000oIO, lI0011loIOIo.I00000oOI);
/* 59 */                        l1I0oI.I0010o();
/* 62 */                        l1I0oI.I0010o();
/* 69 */                        if (Boolean.parseBoolean("")) {
/* 71 */                            l0011i10 l0011i10VarI000o00OoI0I = l00I10oOii.I000o00OoI0I();
/* 75 */                            l0011i10VarI000o00OoI0I.I0000oI00();
/* 2 */                             ((l00I10oOii) l0011i10VarI000o00OoI0I.I00iiI).zzg = true;
/* 89 */                            l00I10oOii l00i10ooii = (l00I10oOii) l0011i10VarI000o00OoI0I.I00000oOI();
/* 97 */                            lI1IliiIoIi li1iliiioii = (lI1IliiIoIi) iooiolo0o0I000o00OoI0I.I000OiO(5, null);
/* 105 */                           if (!li1iliiioii.I00iOIl.equals(iooiolo0o0I000o00OoI0I)) {
/* 113 */                               if (!li1iliiioii.I00iiI.I000O01llI0()) {
/* 115 */                                   li1iliiioii.I0001Ioi1lo();
                                        }
/* 120 */                               lI1IliiIoIi.I00000oIO(li1iliiioii.I00iiI, iooiolo0o0I000o00OoI0I);
                                    }
/* 123 */                           iololOIIO iololoiio = (iololOIIO) li1iliiioii;
/* 125 */                           iololoiio.I0000oI00();
/* 132 */                           iooIolo0o0.I000oI1ioi((iooIolo0o0) iololoiio.I00iiI, l00i10ooii);
/* 140 */                           iooiolo0o0I000o00OoI0I = (iooIolo0o0) iololoiio.I00000oOI();
                                }
/* 148 */                       zzhp zzhpVar = new zzhp();
/* 151 */                       zzhpVar.zzg(iooiolo0o0I000o00OoI0I);
/* 156 */                       Map mapZze = this.zzc.zze();
/* 160 */                       if (mapZze != null) {
/* 172 */                           zzhpVar.zzj(new AssetRegistryService(), new AssetRegistry(mapZze));
                                }
/* 175 */                       this.zzd = zzhpVar;
/* 182 */                       this.zzh = new ConcurrentHashMap();
/* 191 */                       this.zze = new zzhl(this.zzd);
/* 203 */                       lII0I0I000I.I000OOo1O("setInputSidePackets must be called before the graph is started", !this.zzf.get());
/* 214 */                       lII0I0I000I.I000OOo1O("setInputSidePackets must be called after packetCreator is created", this.zze != null);
/* 219 */                       Map mapZzf = this.zzc.zzf();
/* 223 */                       if (mapZzf != null && !mapZzf.isEmpty()) {
/* 234 */                           HashMap map = new HashMap();
/* 249 */                           for (Map.Entry entry : mapZzf.entrySet()) {
/* 275 */                               map.put((String) entry.getKey(), ((MediaPipeInput) entry.getValue()).zzb(this.zze));
                                    }
/* 279 */                           zzhp zzhpVar2 = this.zzd;
/* 281 */                           lII0I0I000I.I000II(zzhpVar2);
/* 284 */                           zzhpVar2.zzi(map);
                                }
/* 287 */                       zzhp zzhpVar3 = this.zzd;
/* 289 */                       lII0I0I000I.I000II(zzhpVar3);
/* 303 */                       zzhpVar3.zzd(this.zzc.zzd(), new zzf(this));
                            } catch (IOException e) {
/* 315 */                       throw new RuntimeException(e);
                            }
                        } catch (lIi0II001O1I e2) {
/* 318 */                   String localizedMessage = e2.getLocalizedMessage();
/* 322 */                   if (localizedMessage != null) {
/* 325 */                       str = localizedMessage;
                            }
/* 329 */                   throw new O1o01iO0liI0(str, 13);
                        }
                    } catch (zzhu e3) {
/* 743 */               throw new O1o01iO0liI0("Error loading MediaPipe graph. ".concat(String.valueOf(e3.getLocalizedMessage())), 13);
                    }
                }

                public final void zze() {
/* 8 */             if (this.zzf.getAndSet(true)) {
/* 20 */                return;
                    }
/* 10 */            zzg();
                }

                public final void zzf(String str, MediaPipeInput mediaPipeInput) throws Throwable {
/* 1 */             zzhl zzhlVar = this.zze;
/* 3 */             lII0I0I000I.I000II(zzhlVar);
/* 6 */             zzhv zzhvVarZzb = mediaPipeInput.zzb(zzhlVar);
                    try {
/* 10 */                zzhp zzhpVar = this.zzd;
/* 12 */                lII0I0I000I.I000II(zzhpVar);
/* 19 */                zzhpVar.zzc(str, zzhvVarZzb, mediaPipeInput.zza());
                    } catch (zzhu e) {
/* 24 */                zzhvVarZzb.zze();
/* 31 */                Log.e(zzb, "Mediapipe error: ", e);
/* 106 */               throw new O1o01iO0liI0("Mediapipe failed with message: ".concat(String.valueOf(e.getMessage())), 13);
                    }
                }
            }
