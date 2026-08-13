            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import com.google.research.xeno.effect.AssetRegistry;
            import com.google.research.xeno.effect.AssetRegistryService;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            import p000.i1Io0lIii;
            import p000.ii1llo1liOl0;
            import p000.iilio10l1i;
            import p000.iioiOOllOioi;
            import p000.il00IIO1OIO;
            import p000.il01olloi1O;
            import p000.il0iloOO01;
            import p000.il0lIIi11;
            import p000.il0oiIoi1oO;
            import p000.iooIolo0o0;
            import p000.l0iOl10lil;
            import p000.l0l0loOO1oI;
            import p000.l1olII;
            import p000.li0i10lI10o;
            import p000.lil0lI0lI1;
            import p000.lillI0;
            
            public final class zzhp {
                private static final li0i10lI10o zza;
                private final List zzc = new ArrayList();
                private final Map zzd = new HashMap();
                private final Map zze = new HashMap();
                private boolean zzf = false;
                private boolean zzg = false;
                private final Map zzh = new HashMap();
                private final Object zzi = new Object();
                private long zzb = zzo();

                static {
                    i1Io0lIii i1io0liiiI00000oIO;
/* 9 */             String strReplace = "com/google/mediapipe/framework/Graph".replace('/', '.');
/* 17 */            ((iioiOOllOioi) iilio10l1i.I00000oIO).getClass();
/* 20 */            AtomicReference atomicReference = il01olloi1O.I0001Ioi1lo;
/* 26 */            if (atomicReference.get() != null) {
/* 34 */                i1io0liiiI00000oIO = ((il0iloOO01) atomicReference.get()).I00000oIO(strReplace);
                    } else {
/* 42 */                int length = strReplace.length();
                        while (true) {
                            length--;
/* 48 */                    if (length >= 0) {
/* 50 */                        char cCharAt = strReplace.charAt(length);
/* 56 */                        if (cCharAt != '$') {
/* 63 */                            if (cCharAt == '.') {
                                        break;
                                    }
                                } else {
/* 58 */                            strReplace = strReplace.replace('$', '.');
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
/* 66 */                il01olloi1O il01olloi1o = new il01olloi1O(strReplace);
/* 71 */                if (il01olloi1O.I0000Il00O || il01olloi1O.I0000O) {
/* 119 */                   Level level = Level.ALL;
/* 121 */                   Set set = il0oiIoi1oO.I0001Ioi1lo;
/* 123 */                   ii1llo1liOl0 ii1llo1liol0 = il0oiIoi1oO.I000II;
/* 125 */                   il0lIIi11 il0liii11 = new il0lIIi11(strReplace);
/* 128 */                   il0liii11.I00000oOI = level;
/* 130 */                   il0liii11.I0000Il00O = set;
/* 132 */                   il0liii11.I0000O = ii1llo1liol0;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   il01olloi1o.I00000oOI = il0liii11;
                        } else if (il01olloi1O.I0000oI00) {
/* 82 */                    il0iloOO01 il0ilooo01 = il0oiIoi1oO.I000O01llI0;
/* 84 */                    Set set2 = il0ilooo01.I00000oOI;
/* 86 */                    ii1llo1liOl0 ii1llo1liol02 = il0ilooo01.I0000Il00O;
/* 88 */                    Level level2 = Level.OFF;
/* 92 */                    il0oiIoi1oO il0oiioi1oo = new il0oiIoi1oO(strReplace);
/* 99 */                    il0oiioi1oo.I00000oOI = lillI0.I00000oIO(strReplace);
/* 101 */                   il0oiioi1oo.I0000Il00O = level2;
/* 103 */                   il0oiioi1oo.I0000O = set2;
/* 105 */                   il0oiioi1oo.I0000oI00 = ii1llo1liol02;
/* 107 */                   VarHandle.storeStoreFence();
/* 110 */                   il01olloi1o.I00000oOI = il0oiioi1oo;
                        } else {
/* 114 */                   il01olloi1o.I00000oOI = null;
                        }
/* 141 */               il00IIO1OIO.I00000oIO.offer(il01olloi1o);
/* 150 */               if (il01olloi1O.I0001Ioi1lo.get() != null) {
                            while (true) {
/* 158 */                       il01olloi1O il01olloi1o2 = (il01olloi1O) il00IIO1OIO.I00000oIO.poll();
/* 160 */                       if (il01olloi1o2 == null) {
                                    break;
                                } else {
/* 176 */                           il01olloi1o2.I00000oOI = ((il0iloOO01) il01olloi1O.I0001Ioi1lo.get()).I00000oIO(il01olloi1o2.I00000oIO);
                                }
                            }
/* 179 */                   il01olloi1O.I000II();
                        }
/* 182 */               i1io0liiiI00000oIO = il01olloi1o;
                    }
/* 183 */           li0i10lI10o li0i10li10o = new li0i10lI10o();
/* 186 */           li0i10li10o.I00000oIO = i1io0liiiI00000oIO;
/* 188 */           VarHandle.storeStoreFence();
/* 191 */           zza = li0i10li10o;
                }

                private final native long zzo();

                private final native long zzp(long j);

                private final native void zzq(long j, List list, zzhz zzhzVar, boolean z);

                private final native void zzr(long j);

                private final native void zzs(long j, byte[] bArr);

                private final native void zzt(long j, String str, long j2, long j3);

                private final native void zzu(long j);

                private final native void zzv(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

                private final native void zzw(long j);

                private final native void zzx(long j);

                private static void zzy(Map map, String[] strArr, long[] jArr) {
/* 6 */             if (map.size() != strArr.length || map.size() != jArr.length) {
/* 98 */                throw new RuntimeException("Input array length doesn't match the map size!");
                    }
/* 23 */            int i = 0;
/* 28 */            for (Map.Entry entry : map.entrySet()) {
/* 42 */                strArr[i] = (String) entry.getKey();
/* 54 */                jArr[i] = ((zzhv) entry.getValue()).zza();
/* 56 */                i++;
                    }
                }

                public final synchronized long zza() {
/* 2 */             return this.zzb;
                }

                public final zzhr zzb() {
/* 16 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called already.", this.zzb != 0);
/* 23 */            long jZzp = zzp(this.zzb);
/* 27 */            zzhr zzhrVar = new zzhr();
/* 37 */            lil0lI0lI1.I00000oIO("Invalid profiler, tearDown() might have been called already.", jZzp != 0);
/* 40 */            zzhrVar.I00000oIO = jZzp;
/* 42 */            zzhrVar.I00000oOI = this;
/* 44 */            VarHandle.storeStoreFence();
/* 55 */            return zzhrVar;
                }

                public final synchronized void zzc(String str, zzhv zzhvVar, long j) throws Throwable {
                    zzhp zzhpVar;
                    Throwable th;
                    try {
                        try {
/* 15 */                    lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */                    if (this.zzg) {
/* 164 */                       zzt(this.zzb, str, zzhvVar.zza(), j);
/* 167 */                       zzhvVar.zze();
/* 171 */                       return;
                            }
                            try {
/* 22 */                        zzhv zzhvVarZzc = zzhvVar.zzc();
/* 32 */                        if (!this.zzh.containsKey(str)) {
/* 41 */                            this.zzh.put(str, new ArrayList());
                                }
/* 56 */                        List list = (List) this.zzh.get(str);
/* 64 */                        if (list.size() > 20) {
/* 80 */                            for (Map.Entry entry : this.zze.entrySet()) {
/* 92 */                                if (entry.getValue() == null) {
/* 94 */                                    li0i10lI10o li0i10li10o = zza;
/* 96 */                                    li0i10li10o.getClass();
/* 119 */                                   ((l1olII) li0i10li10o.I00000oIO(Level.SEVERE).I0000Il00O(578, "addPacketToBuffer")).I00000oIO(entry.getKey());
                                        }
                                    }
/* 130 */                           throw new RuntimeException("Graph is not started because of missing streams");
                                }
/* 133 */                       Long lValueOf = Long.valueOf(j);
/* 137 */                       l0iOl10lil l0iol10lil = new l0iOl10lil();
/* 140 */                       l0iol10lil.I00000oIO = zzhvVarZzc;
/* 142 */                       l0iol10lil.I00000oOI = lValueOf;
/* 144 */                       VarHandle.storeStoreFence();
/* 147 */                       list.add(l0iol10lil);
/* 150 */                       zzhvVar.zze();
                            } catch (Throwable th2) {
/* 46 */                        th = th2;
/* 47 */                        zzhpVar = this;
/* 408 */                       throw th;
                            }
                        } catch (Throwable th3) {
/* 172 */                   th = th3;
/* 173 */                   th = th;
/* 408 */                   throw th;
                        }
                    } catch (Throwable th4) {
/* 175 */               th = th4;
/* 176 */               zzhpVar = this;
/* 173 */               th = th;
/* 408 */               throw th;
                    }
                }

                public final synchronized void zzd(List list, zzhz zzhzVar) {
/* 3 */             zze(list, zzhzVar, false);
                }

                public final synchronized void zze(List list, zzhz zzhzVar, boolean z) throws Throwable {
                    try {
                        try {
/* 15 */                    lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called already.", this.zzb != 0);
/* 20 */                    if (this.zzg || this.zzf) {
/* 54 */                        throw new IllegalStateException();
                            }
/* 28 */                    this.zzc.add(zzhzVar);
/* 37 */                    zzq(this.zzb, list, zzhzVar, false);
                        } catch (Throwable th) {
/* 42 */                    th = th;
/* 98 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 45 */                th = th2;
/* 98 */                throw th;
                    }
                }

                public final synchronized void zzf() {
/* 15 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */            zzr(this.zzb);
                }

                public final synchronized void zzg(iooIolo0o0 iooiolo0o0) {
/* 6 */             zzh(iooiolo0o0.I00000oOI());
                }

                public final synchronized void zzh(byte[] bArr) {
/* 15 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called already.", this.zzb != 0);
/* 20 */            zzs(this.zzb, bArr);
                }

                public final synchronized void zzi(Map map) {
/* 15 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */            if (this.zzg || this.zzf) {
/* 77 */                throw new IllegalStateException();
                    }
/* 38 */            for (Map.Entry entry : map.entrySet()) {
/* 64 */                this.zzd.put((String) entry.getKey(), ((zzhv) entry.getValue()).zzc());
                    }
                }

                public final synchronized void zzj(l0l0loOO1oI l0l0looo1oi, Object obj) {
/* 10 */            ((AssetRegistryService) l0l0looo1oi).nativeInstallServiceObject(this.zzb, ((AssetRegistry) obj).I00000oIO);
                }

                public final synchronized void zzk() {
/* 17 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */            this.zzf = true;
/* 28 */            Iterator it = this.zze.entrySet().iterator();
/* 36 */            while (it.hasNext()) {
/* 48 */                if (((Map.Entry) it.next()).getValue() == null) {
/* 50 */                    li0i10lI10o li0i10li10o = zza;
/* 52 */                    li0i10li10o.getClass();
/* 71 */                    ((l1olII) li0i10li10o.I00000oIO(Level.INFO).I0000Il00O(333, "startRunningGraph")).zzm();
/* 75 */                    return;
                        }
                    }
/* 85 */            String[] strArr = new String[this.zzd.size()];
/* 93 */            long[] jArr = new long[this.zzd.size()];
/* 97 */            zzy(this.zzd, strArr, jArr);
/* 106 */           String[] strArr2 = new String[this.zze.size()];
/* 114 */           long[] jArr2 = new long[this.zze.size()];
/* 118 */           zzy(this.zze, strArr2, jArr2);
/* 124 */           zzv(this.zzb, strArr, jArr, strArr2, jArr2);
/* 127 */           this.zzg = true;
/* 135 */           if (this.zzh.isEmpty()) {
/* 255 */               return;
                    }
/* 151 */           for (Map.Entry entry : this.zzh.entrySet()) {
/* 165 */               ArrayList arrayList = (ArrayList) entry.getValue();
/* 167 */               int size = arrayList.size();
/* 172 */               for (int i = 0; i < size; i++) {
/* 179 */                   l0iOl10lil l0iol10lil = (l0iOl10lil) arrayList.get(i);
                            try {
/* 202 */                       zzt(this.zzb, (String) entry.getKey(), l0iol10lil.I00000oIO.zza(), l0iol10lil.I00000oOI.longValue());
/* 207 */                       l0iol10lil.I00000oIO.zze();
                            } catch (zzhu e) {
/* 214 */                       li0i10lI10o li0i10li10o2 = zza;
/* 216 */                       li0i10li10o2.getClass();
/* 243 */                       ((l1olII) li0i10li10o2.I00000oIO(Level.SEVERE).I0000Il00O(597, "moveBufferedPacketsToInputStream")).I00000oOI(e.getMessage(), entry.getKey());
/* 246 */                       throw e;
                            }
                        }
                    }
/* 249 */           this.zzh.clear();
                }

                public final synchronized void zzl() {
                    try {
/* 16 */                lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called already.", this.zzb != 0);
/* 25 */                Iterator it = this.zzd.entrySet().iterator();
/* 33 */                while (it.hasNext()) {
/* 47 */                    ((zzhv) ((Map.Entry) it.next()).getValue()).zze();
                        }
/* 56 */                this.zzd.clear();
/* 73 */                for (Map.Entry entry : this.zze.entrySet()) {
/* 85 */                    if (entry.getValue() != null) {
/* 93 */                        ((zzhv) entry.getValue()).zze();
                            }
                        }
/* 99 */                this.zze.clear();
/* 108 */               Iterator it2 = this.zzh.entrySet().iterator();
/* 116 */               while (it2.hasNext()) {
/* 128 */                   ArrayList arrayList = (ArrayList) ((Map.Entry) it2.next()).getValue();
/* 130 */                   int size = arrayList.size();
/* 135 */                   for (int i = 0; i < size; i++) {
/* 145 */                       ((l0iOl10lil) arrayList.get(i)).I00000oIO.zze();
                            }
                        }
/* 153 */               this.zzh.clear();
                        synchronized (this.zzi) {
                            try {
/* 159 */                       long j = this.zzb;
/* 163 */                       if (j != 0) {
/* 165 */                           zzu(j);
/* 168 */                           this.zzb = 0L;
                                }
                            } finally {
                            }
                        }
/* 176 */               this.zzc.clear();
                    } catch (Throwable th) {
/* 245 */               throw th;
                    }
                }

                public final synchronized void zzm() {
/* 15 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */            zzw(this.zzb);
                }

                public final synchronized void zzn() {
/* 15 */            lil0lI0lI1.I00000oIO("Invalid context, tearDown() might have been called.", this.zzb != 0);
/* 20 */            zzx(this.zzb);
                }
            }
