            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.Executor;
            
            public final class zzatz {
                public static final zzatz zza;
                private final zzavf zzb;
                private final Executor zzc;
                private final Object[][] zzd;
                private final List zze;
                private final Boolean zzf;
                private final Integer zzg;
                private final Integer zzh;

                static {
/* 3 */             zzatw zzatwVar = new zzatw();
/* 23 */            zzatwVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
/* 27 */            zzatwVar.zzd = Collections.EMPTY_LIST;
/* 35 */            zza = new zzatz(zzatwVar, null);
                }

                public zzatz(zzatw zzatwVar, zzaty zzatyVar) {
/* 6 */             this.zzb = zzatwVar.zza;
/* 10 */            this.zzc = zzatwVar.zzb;
/* 14 */            this.zzd = zzatwVar.zzc;
/* 18 */            this.zze = zzatwVar.zzd;
/* 22 */            this.zzf = zzatwVar.zze;
/* 26 */            this.zzg = zzatwVar.zzf;
/* 30 */            this.zzh = zzatwVar.zzg;
                }

                private static zzatw zzp(zzatz zzatzVar) {
/* 3 */             zzatw zzatwVar = new zzatw();
/* 8 */             zzatwVar.zza = zzatzVar.zzb;
/* 12 */            zzatwVar.zzb = zzatzVar.zzc;
/* 16 */            zzatwVar.zzc = zzatzVar.zzd;
/* 20 */            zzatwVar.zzd = zzatzVar.zze;
/* 24 */            zzatwVar.zze = zzatzVar.zzf;
/* 28 */            zzatwVar.zzf = zzatzVar.zzg;
/* 32 */            zzatwVar.zzg = zzatzVar.zzh;
/* 77 */            return zzatwVar;
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("deadline", this.zzb);
/* 15 */            zzgkVarZzb.zzd("authority", null);
/* 20 */            zzgkVarZzb.zzd("callCredentials", null);
/* 23 */            Executor executor = this.zzc;
/* 35 */            zzgkVarZzb.zzd("executor", executor != null ? executor.getClass() : null);
/* 40 */            zzgkVarZzb.zzd("compressorName", null);
/* 51 */            zzgkVarZzb.zzd("customOptions", Arrays.deepToString(this.zzd));
/* 60 */            zzgkVarZzb.zze("waitForReady", zzo());
/* 67 */            zzgkVarZzb.zzd("maxInboundMessageSize", this.zzg);
/* 74 */            zzgkVarZzb.zzd("maxOutboundMessageSize", this.zzh);
/* 79 */            zzgkVarZzb.zzd("onReadyThreshold", null);
/* 86 */            zzgkVarZzb.zzd("streamTracerFactories", this.zze);
/* 89 */            return zzgkVarZzb.toString();
                }

                public final zzatz zza(zzavf zzavfVar) {
/* 1 */             zzatw zzatwVarZzp = zzp(this);
/* 5 */             zzatwVarZzp.zza = zzavfVar;
/* 10 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzb(Executor executor) {
/* 1 */             zzatw zzatwVarZzp = zzp(this);
/* 5 */             zzatwVarZzp.zzb = executor;
/* 10 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzc(int i) {
/* 8 */             zzgo.zzh(i >= 0, "invalid maxsize %s", i);
/* 11 */            zzatw zzatwVarZzp = zzp(this);
/* 19 */            zzatwVarZzp.zzf = Integer.valueOf(i);
/* 24 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzd(int i) {
/* 8 */             zzgo.zzh(i >= 0, "invalid maxsize %s", i);
/* 11 */            zzatw zzatwVarZzp = zzp(this);
/* 19 */            zzatwVarZzp.zzg = Integer.valueOf(i);
/* 24 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zze(zzatx zzatxVar, Object obj) {
                    Object[][] objArr;
                    int length;
/* 1 */             zzatw zzatwVarZzp = zzp(this);
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 objArr = this.zzd;
/* 9 */                 length = objArr.length;
/* 11 */                if (i >= length) {
/* 27 */                    i = -1;
                            break;
                        }
/* 21 */                if (zzatxVar.equals(objArr[i][0])) {
                            break;
                        }
/* 24 */                i++;
                    }
/* 48 */            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
/* 50 */            zzatwVarZzp.zzc = objArr2;
/* 52 */            System.arraycopy(objArr, 0, objArr2, 0, length);
/* 55 */            Object[][] objArr3 = zzatwVarZzp.zzc;
/* 57 */            if (i == -1) {
/* 63 */                objArr3[length] = new Object[]{zzatxVar, obj};
                    } else {
/* 70 */                objArr3[i] = new Object[]{zzatxVar, obj};
                    }
/* 75 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzf(zzauj zzaujVar) {
/* 3 */             List list = this.zze;
/* 11 */            ArrayList arrayList = new ArrayList(list.size() + 1);
/* 14 */            arrayList.addAll(list);
/* 17 */            arrayList.add(zzaujVar);
/* 20 */            zzatw zzatwVarZzp = zzp(this);
/* 28 */            zzatwVarZzp.zzd = Collections.unmodifiableList(arrayList);
/* 33 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzg() {
/* 1 */             zzatw zzatwVarZzp = zzp(this);
/* 7 */             zzatwVarZzp.zze = Boolean.TRUE;
/* 12 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzatz zzh() {
/* 1 */             zzatw zzatwVarZzp = zzp(this);
/* 7 */             zzatwVarZzp.zze = Boolean.FALSE;
/* 12 */            return new zzatz(zzatwVarZzp, null);
                }

                public final zzavf zzi() {
/* 1 */             return this.zzb;
                }

                public final Integer zzj() {
/* 1 */             return this.zzg;
                }

                public final Integer zzk() {
/* 1 */             return this.zzh;
                }

                public final Object zzl(zzatx zzatxVar) {
/* 3 */             zzgo.zzc(zzatxVar, "key");
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 Object[][] objArr = this.zzd;
/* 11 */                if (i >= objArr.length) {
/* 1 */                     return zzatxVar.zzb;
                        }
/* 21 */                if (zzatxVar.equals(objArr[i][0])) {
/* 26 */                    return objArr[i][1];
                        }
/* 29 */                i++;
                    }
                }

                public final List zzm() {
/* 1 */             return this.zze;
                }

                public final Executor zzn() {
/* 1 */             return this.zzc;
                }

                public final boolean zzo() {
/* 5 */             return Boolean.TRUE.equals(this.zzf);
                }
            }
