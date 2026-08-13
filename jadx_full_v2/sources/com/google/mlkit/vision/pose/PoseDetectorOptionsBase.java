            package com.google.mlkit.vision.pose;

            import android.util.Log;
            import android.util.Pair;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import p000.I00IOO;
            import p000.I01l10Oi;
            import p000.I0oO0iO1l0lo;
            import p000.i000IO;
            import p000.i1olliOl;
            import p000.ii01IlIiIo;
            import p000.iiOOi1OolOlO;
            import p000.l1IllOOOo1;
            import p000.l1ioii1I10Io;
            import p000.l1oliIio;
            import p000.lII0I0I000I;
            import p000.ll0IioI0;
            import p000.ll1I00iIol;
            import p000.lo0ii11;
            import p000.lo0llI1iioOI;
            import p000.lo0oIl0IoI;
            import p000.lo10I0oIO1IO;
            import p000.lo1I1l1Oo1I1;
            import p000.o0Iil1O;
            
            public class PoseDetectorOptionsBase implements I01l10Oi {
                public static final int CPU = 1;
                public static final int CPU_GPU = 2;
                public static final int SINGLE_IMAGE_MODE = 2;
                public static final int STREAM_MODE = 1;
                private final int zza;
                private final Executor zzb;
                private final boolean zzc;
                private final String zzd;
                private final String zze;
                private final int[] zzf;
                private final String zzg;
                private final boolean zzh;

                public static abstract class Builder<B extends Builder<B>> {
                    protected String zza;
                    protected boolean zzb;
                    private Executor zzd;
                    private boolean zze;
                    private String zzf;
                    private String zzg;
                    private int zzc = 1;
                    private int[] zzh = {1, 2};

                    public abstract PoseDetectorOptionsBase build();

                    public B setDetectorMode(int i) {
/* 1 */                 this.zzc = i;
/* 49 */                return this;
                    }

                    public B setExecutor(Executor executor) {
/* 1 */                 this.zzd = executor;
/* 49 */                return this;
                    }

                    public B setModelInfo(boolean z, String str, String str2) {
/* 1 */                 this.zze = z;
/* 5 */                 lII0I0I000I.I000O01llI0("personModelPath cannot be null", str);
/* 8 */                 this.zzf = str;
/* 12 */                lII0I0I000I.I000O01llI0("landmarkModelPath cannot be null", str2);
/* 15 */                this.zzg = str2;
/* 215 */               return this;
                    }

                    public B setPreferredHardwareConfigs(int i, int... iArr) {
/* 8 */                 lII0I0I000I.I00000oIO("moreConfigs cannot be null", iArr != null);
/* 11 */                int length = iArr.length;
/* 14 */                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
/* 18 */                this.zzh = iArrCopyOf;
/* 20 */                iArrCopyOf[length] = i;
/* 89 */                return this;
                    }
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface DetectorMode {
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface HardwareConfig {
                }

                public PoseDetectorOptionsBase(Builder<?> builder) {
/* 8 */             this.zza = ((Builder) builder).zzc;
/* 14 */            this.zzb = ((Builder) builder).zzd;
/* 20 */            this.zzc = ((Builder) builder).zze;
/* 26 */            this.zzd = ((Builder) builder).zzf;
/* 32 */            this.zze = ((Builder) builder).zzg;
/* 38 */            this.zzf = ((Builder) builder).zzh;
/* 42 */            this.zzg = builder.zza;
/* 46 */            this.zzh = builder.zzb;
                }

                private final zza zzh() {
/* 3 */             zza zzaVar = new zza();
/* 8 */             zzaVar.zza = this.zzg;
/* 12 */            zzaVar.zzb = this.zzh;
/* 16 */            zzaVar.setDetectorMode(this.zza);
/* 25 */            zzaVar.setModelInfo(this.zzc, this.zzd, this.zze);
/* 28 */            Executor executor = this.zzb;
/* 30 */            if (executor != null) {
/* 32 */                zzaVar.setExecutor(executor);
                    }
/* 35 */            int[] iArr = this.zzf;
/* 37 */            int length = iArr.length;
                    int i = length - 1;
/* 40 */            int i2 = iArr[i];
/* 43 */            if (length == 1) {
/* 48 */                zzaVar.setPreferredHardwareConfigs(i2, new int[0]);
/* 51 */                return zzaVar;
                    }
/* 56 */            zzaVar.setPreferredHardwareConfigs(i2, Arrays.copyOf(iArr, i));
/* 113 */           return zzaVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x00bf A[PHI: r3
                  0x00bf: PHI (r3v10 java.lang.Boolean) = (r3v8 java.lang.Boolean), (r3v9 java.lang.Boolean) binds: [B:19:0x00bd, B:22:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object decode(String str) {
                    Integer numValueOf;
/* 3 */             I0oO0iO1l0lo i0oO0iO1l0loI00100o1O0lo = I0oO0iO1l0lo.I00100o1O0lo(" && ");
/* 9 */             ll0IioI0 ll0iioi0 = (ll0IioI0) i0oO0iO1l0loI00100o1O0lo.I00iiO;
/* 15 */            i1olliOl i1olliol = (i1olliOl) i0oO0iO1l0loI00100o1O0lo.I00iio;
/* 18 */            I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(i1olliol, true, ll0iioi0);
/* 23 */            I0oO0iO1l0lo i0oO0iO1l0loI00100o1O0lo2 = I0oO0iO1l0lo.I00100o1O0lo(" == ");
/* 29 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 32 */            str.getClass();
/* 35 */            Iterator itI00000oIO = i1olliol.I00000oIO(i0oO0iO1l0lo, str);
                    while (true) {
/* 40 */                o0Iil1O o0iil1o = (o0Iil1O) itI00000oIO;
/* 46 */                if (!o0iil1o.hasNext()) {
                            break;
                        }
/* 52 */                String str2 = (String) o0iil1o.next();
/* 62 */                o0Iil1O o0iil1o2 = (o0Iil1O) ((i1olliOl) i0oO0iO1l0loI00100o1O0lo2.I00iio).I00000oIO(i0oO0iO1l0loI00100o1O0lo2, str2);
/* 70 */                ll1I00iIol.I00000oIO("Chunk [%s] is not a valid entry", str2, o0iil1o2.hasNext());
/* 77 */                String str3 = (String) o0iil1o2.next();
/* 86 */                ll1I00iIol.I00000oIO("Duplicate key [%s] found.", str3, !linkedHashMap.containsKey(str3));
/* 93 */                ll1I00iIol.I00000oIO("Chunk [%s] is not a valid entry", str2, o0iil1o2.hasNext());
/* 102 */               linkedHashMap.put(str3, (String) o0iil1o2.next());
/* 110 */               ll1I00iIol.I00000oIO("Chunk [%s] is not a valid entry", str2, !o0iil1o2.hasNext());
                    }
/* 114 */           Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
/* 120 */           zza zzaVar = new zza();
/* 129 */           String str4 = (String) mapUnmodifiableMap.get("detector_mode");
/* 131 */           Boolean bool = null;
/* 132 */           if (str4 == null) {
/* 158 */               numValueOf = null;
                    } else {
                        try {
/* 139 */                   numValueOf = Integer.valueOf(Integer.parseInt(str4));
                        } catch (NumberFormatException unused) {
/* 151 */                   if (Log.isLoggable("AcceleratableOptions", 3)) {
/* 155 */                       "Value cannot be parsed to int: ".concat(str4);
                            }
                        }
                    }
/* 159 */           lII0I0I000I.I000II(numValueOf);
/* 166 */           zzaVar.setDetectorMode(numValueOf.intValue());
/* 175 */           String str5 = (String) mapUnmodifiableMap.get("are_fast_models");
/* 177 */           if (str5 != null) {
/* 180 */               Boolean bool2 = Boolean.TRUE;
/* 190 */               if (bool2.toString().equals(str5)) {
/* 192 */                   bool = bool2;
                        } else {
/* 194 */                   bool2 = Boolean.FALSE;
/* 204 */                   if (bool2.toString().equals(str5)) {
                            }
                        }
                    }
/* 207 */           lII0I0I000I.I000II(bool);
/* 210 */           boolean zBooleanValue = bool.booleanValue();
/* 220 */           String str6 = (String) mapUnmodifiableMap.get("person_model_path");
/* 222 */           lII0I0I000I.I000II(str6);
/* 231 */           String str7 = (String) mapUnmodifiableMap.get("landmark_model_path");
/* 233 */           lII0I0I000I.I000II(str7);
/* 236 */           zzaVar.setModelInfo(zBooleanValue, str6, str7);
/* 247 */           zzaVar.zza = (String) mapUnmodifiableMap.get("run_config_name");
/* 249 */           zzaVar.zzb = true;
/* 253 */           return new PoseDetectorOptionsBase(zzaVar);
                }

                @Override
                public final String encode() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int i = this.zza;
/* 10 */            StringBuilder sb = new StringBuilder();
/* 13 */            sb.append(i);
/* 27 */            arrayList.add(new Pair("detector_mode", sb.toString()));
/* 30 */            boolean z = this.zzc;
/* 34 */            StringBuilder sb2 = new StringBuilder();
/* 37 */            sb2.append(z);
/* 51 */            arrayList.add(new Pair("are_fast_models", sb2.toString()));
/* 54 */            String str = this.zzd;
/* 56 */            if (str != null) {
/* 65 */                arrayList.add(new Pair("person_model_path", str));
                    }
/* 68 */            String str2 = this.zze;
/* 70 */            if (str2 != null) {
/* 79 */                arrayList.add(new Pair("landmark_model_path", str2));
                    }
/* 82 */            String str3 = this.zzg;
/* 84 */            if (str3 != null) {
/* 93 */                arrayList.add(new Pair("run_config_name", str3));
                    }
/* 98 */            StringBuilder sb3 = new StringBuilder();
/* 101 */           Iterator it = arrayList.iterator();
/* 109 */           while (it.hasNext()) {
/* 115 */               Pair pair = (Pair) it.next();
/* 121 */               sb3.append((String) pair.first);
/* 126 */               sb3.append(" == ");
/* 133 */               sb3.append((String) pair.second);
/* 138 */               sb3.append(" && ");
                    }
/* 142 */           return sb3.toString();
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof PoseDetectorOptionsBase)) {
/* 7 */                 return false;
                    }
/* 11 */            PoseDetectorOptionsBase poseDetectorOptionsBase = (PoseDetectorOptionsBase) obj;
                    return getClass().equals(poseDetectorOptionsBase.getClass()) && this.zza == poseDetectorOptionsBase.zza && this.zzc == poseDetectorOptionsBase.zzc && l1ioii1I10Io.I00000oIO(this.zzd, poseDetectorOptionsBase.zzd) && l1ioii1I10Io.I00000oIO(this.zze, poseDetectorOptionsBase.zze) && Arrays.equals(this.zzf, poseDetectorOptionsBase.zzf) && l1ioii1I10Io.I00000oIO(this.zzg, poseDetectorOptionsBase.zzg) && this.zzh == poseDetectorOptionsBase.zzh && l1ioii1I10Io.I00000oIO(this.zzb, poseDetectorOptionsBase.zzb);
                }

                public Executor getExecutor() {
/* 1 */             return this.zzb;
                }

                public final int[] getPreferredHardwareConfigs() {
/* 1 */             return this.zzf;
                }

                @Override
                public final String getRunConfigName() {
/* 1 */             return this.zzg;
                }

                public int hashCode() {
/* 45 */            return Arrays.hashCode(new Object[]{getClass(), Integer.valueOf(this.zza), Boolean.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzg, Boolean.valueOf(this.zzh), this.zzb});
                }

                public final boolean isForBenchmark() {
/* 1 */             return this.zzh;
                }

                public String toString() {
/* 5 */             i000IO i000io = new i000IO(11);
/* 10 */            int i = 3;
/* 11 */            l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(i);
/* 14 */            i000io.I00iiI = l1illoooo1;
/* 16 */            i000io.I00iiO = l1illoooo1;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            String strValueOf = String.valueOf(this.zza);
/* 29 */            l1oliIio l1oliiio = new l1oliIio(i);
/* 36 */            ((l1IllOOOo1) i000io.I00iiO).I00iio = l1oliiio;
/* 38 */            i000io.I00iiO = l1oliiio;
/* 40 */            l1oliiio.I00iiO = strValueOf;
/* 44 */            l1oliiio.I00iiI = "detectorMode";
/* 48 */            String strValueOf2 = String.valueOf(this.zzc);
/* 54 */            l1oliIio l1oliiio2 = new l1oliIio(i);
/* 61 */            ((l1IllOOOo1) i000io.I00iiO).I00iio = l1oliiio2;
/* 63 */            i000io.I00iiO = l1oliiio2;
/* 65 */            l1oliiio2.I00iiO = strValueOf2;
/* 69 */            l1oliiio2.I00iiI = "areFastModels";
/* 71 */            String str = this.zzd;
/* 75 */            l1IllOOOo1 l1illoooo12 = new l1IllOOOo1(i);
/* 78 */            l1oliiio2.I00iio = l1illoooo12;
/* 80 */            i000io.I00iiO = l1illoooo12;
/* 82 */            l1illoooo12.I00iiO = str;
/* 86 */            l1illoooo12.I00iiI = "personModelPath";
/* 88 */            String str2 = this.zze;
/* 92 */            l1IllOOOo1 l1illoooo13 = new l1IllOOOo1(i);
/* 95 */            l1illoooo12.I00iio = l1illoooo13;
/* 97 */            i000io.I00iiO = l1illoooo13;
/* 99 */            l1illoooo13.I00iiO = str2;
/* 103 */           l1illoooo13.I00iiI = "landmarkModelPath";
/* 105 */           Executor executor = this.zzb;
/* 109 */           l1IllOOOo1 l1illoooo14 = new l1IllOOOo1(i);
/* 112 */           l1illoooo13.I00iio = l1illoooo14;
/* 114 */           i000io.I00iiO = l1illoooo14;
/* 116 */           l1illoooo14.I00iiO = executor;
/* 120 */           l1illoooo14.I00iiI = "executor";
/* 122 */           return i000io.toString();
                }

                public final int zza() {
/* 1 */             return this.zza;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final lo1I1l1Oo1I1 zzb() {
                    lo10I0oIO1IO lo10i0oio1io;
                    lo0llI1iioOI lo0lli1iiooi;
/* 9 */             lo0ii11 lo0ii11Var = this.zza == 1 ? lo0ii11.STREAM : lo0ii11.SINGLE_IMAGE;
/* 19 */            lo0oIl0IoI lo0oil0ioi = this.zzc ? lo0oIl0IoI.FAST : lo0oIl0IoI.ACCURATE;
/* 17 */            lo0oIl0IoI lo0oil0ioi2 = lo0oil0ioi;
/* 23 */            Object[] objArrCopyOf = new Object[4];
/* 25 */            int[] iArr = this.zzf;
/* 27 */            int length = iArr.length;
/* 29 */            int i = 0;
/* 30 */            int i2 = 0;
/* 31 */            while (i < length) {
/* 33 */                int i3 = iArr[i];
/* 35 */                lo0llI1iioOI[] lo0lli1iiooiArrValues = lo0llI1iioOI.values();
/* 39 */                int length2 = lo0lli1iiooiArrValues.length;
/* 40 */                int i4 = 0;
                        while (true) {
/* 41 */                    if (i4 >= length2) {
/* 53 */                        lo0lli1iiooi = lo0llI1iioOI.HARDWARE_CONFIG_UNKNOWN;
                                break;
                            }
/* 43 */                    lo0lli1iiooi = lo0lli1iiooiArrValues[i4];
/* 47 */                    if (lo0lli1iiooi.I00iOIl == i3) {
                                break;
                            }
/* 50 */                    i4++;
                        }
/* 55 */                int i5 = i2 + 1;
/* 57 */                int length3 = objArrCopyOf.length;
/* 58 */                if (length3 < i5) {
/* 64 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, I00IOO.I000iOII(length3, i5));
                        }
/* 68 */                objArrCopyOf[i2] = lo0lli1iiooi;
/* 70 */                i++;
/* 72 */                i2 = i5;
                    }
/* 74 */            iiOOi1OolOlO iiooi1oololoI001iOo1i0O = ii01IlIiIo.I001iOo1i0O(i2, objArrCopyOf);
/* 78 */            String str = this.zzg;
/* 80 */            if (str != null) {
/* 82 */                int iHashCode = str.hashCode();
/* 89 */                if (iHashCode != 337549753) {
/* 119 */                   lo10i0oio1io = (iHashCode == 1693142784 && str.equals("default_config")) ? lo10I0oIO1IO.RUN_CONFIG_DEFAULT : lo10I0oIO1IO.RUN_CONFIG_UNKNOWN;
                        } else if (str.equals("cpu-gpu-opencl")) {
/* 116 */                   lo10i0oio1io = lo10I0oIO1IO.RUN_CONFIG_CPU_GPU_OPENCL;
                        }
                    } else {
/* 122 */               lo10i0oio1io = null;
                    }
/* 125 */           lo1I1l1Oo1I1 lo1i1l1oo1i1 = new lo1I1l1Oo1I1();
/* 128 */           lo1i1l1oo1i1.I00000oIO = lo0ii11Var;
/* 130 */           lo1i1l1oo1i1.I00000oOI = lo0oil0ioi;
/* 132 */           lo1i1l1oo1i1.I0000Il00O = lo0oil0ioi2;
/* 134 */           lo1i1l1oo1i1.I0000O = iiooi1oololoI001iOo1i0O;
/* 136 */           lo1i1l1oo1i1.I0000oI00 = lo10i0oio1io;
/* 138 */           VarHandle.storeStoreFence();
/* 541 */           return lo1i1l1oo1i1;
                }

                public final PoseDetectorOptionsBase zzc() {
/* 1 */             zza zzaVarZzh = zzh();
/* 6 */             zzaVarZzh.setDetectorMode(2);
/* 11 */            return new PoseDetectorOptionsBase(zzaVarZzh);
                }

                @Override
                public final PoseDetectorOptionsBase cloneWithRunConfigAssigned(String str, boolean z) {
/* 1 */             zza zzaVarZzh = zzh();
/* 5 */             zzaVarZzh.zza = str;
/* 7 */             zzaVarZzh.zzb = z;
/* 11 */            return new PoseDetectorOptionsBase(zzaVarZzh);
                }

                public final String zze() {
/* 1 */             return this.zze;
                }

                public final String zzf() {
/* 1 */             return this.zzd;
                }

                public final boolean zzg() {
/* 1 */             return this.zzc;
                }
            }
