            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            import java.util.logging.Logger;
            import p000.OIiilo1Ool0o;
            
/* 7 */     public final class zzaxq {
                private Object[] zzd;
                private int zze;
                private static final Logger zzc = Logger.getLogger(zzaxq.class.getName());
                public static final zzaxi zza = new zzaxg();
                static final zzih zzb = zzih.zzf().zzd();

                public zzaxq(int i, Object[] objArr) {
/* 4 */             this.zze = i;
/* 6 */             this.zzd = objArr;
                }

                public static byte[] zzg(InputStream inputStream) {
                    try {
/* 1 */                 return zzij.zza(inputStream);
                    } catch (IOException e) {
/* 9 */                 OIiilo1Ool0o.I000iOII("failure reading serialized stream", e);
/* 12 */                return null;
                    }
                }

                private final int zzi() {
/* 1 */             Object[] objArr = this.zzd;
/* 3 */             if (objArr != null) {
/* 5 */                 return objArr.length;
                    }
/* 7 */             return 0;
                }

                private final Object zzj(int i) {
/* 6 */             return this.zzd[i + i + 1];
                }

                private final void zzk(int i) {
/* 1 */             Object[] objArr = new Object[i];
/* 7 */             if (!zzm()) {
/* 9 */                 Object[] objArr2 = this.zzd;
/* 11 */                int i2 = this.zze;
/* 15 */                System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
                    }
/* 18 */            this.zzd = objArr;
                }

                private final void zzl(int i, Object obj) {
/* 5 */             if (this.zzd instanceof byte[][]) {
/* 11 */                zzk(zzi());
                    }
/* 19 */            this.zzd[i + i + 1] = obj;
                }

                private final boolean zzm() {
                    return this.zze == 0;
                }

                private final byte[] zzn(int i) {
/* 6 */             return (byte[]) this.zzd[i + i];
                }

                private final byte[] zzo(int i) {
/* 1 */             Object objZzj = zzj(i);
                    return objZzj instanceof byte[] ? (byte[]) objZzj : ((zzaxm) objZzj).zzb();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Metadata(");
/* 12 */            for (int i = 0; i < this.zze; i++) {
/* 14 */                if (i != 0) {
/* 18 */                    sb.append(',');
                        }
/* 23 */                byte[] bArrZzn = zzn(i);
/* 27 */                Charset charset = StandardCharsets.US_ASCII;
/* 29 */                String str = new String(bArrZzn, charset);
/* 32 */                sb.append(str);
/* 37 */                sb.append('=');
/* 46 */                if (str.endsWith("-bin")) {
/* 48 */                    zzih zzihVar = zzb;
/* 50 */                    byte[] bArrZzo = zzo(i);
/* 59 */                    sb.append(zzihVar.zzg(bArrZzo, 0, bArrZzo.length));
                        } else {
/* 72 */                    sb.append(new String(zzo(i), charset));
                        }
                    }
/* 80 */            sb.append(')');
/* 83 */            return sb.toString();
                }

                public final int zza() {
/* 1 */             return this.zze;
                }

                public final Object zzb(zzaxk zzaxkVar) {
/* 1 */             int i = this.zze;
/* 19 */            do {
                        i--;
/* 5 */                 if (i < 0) {
/* 47 */                    return null;
                        }
/* 19 */            } while (!Arrays.equals(zzaxkVar.zzg(), zzn(i)));
/* 21 */            Object objZzj = zzj(i);
                    return objZzj instanceof byte[] ? zzaxkVar.zza((byte[]) objZzj) : zzaxkVar.zza(((zzaxm) objZzj).zzb());
                }

                public final void zzd(zzaxk zzaxkVar) {
/* 5 */             if (zzm()) {
/* 77 */                return;
                    }
/* 7 */             int i = 0;
/* 8 */             int i2 = 0;
                    while (true) {
/* 9 */                 int i3 = this.zze;
/* 11 */                if (i >= i3) {
/* 55 */                    Arrays.fill(this.zzd, i2 + i2, i3 + i3, (Object) null);
/* 58 */                    this.zze = i2;
/* 77 */                    return;
                        } else {
/* 25 */                    if (!Arrays.equals(zzaxkVar.zzg(), zzn(i))) {
/* 35 */                        this.zzd[i2 + i2] = zzn(i);
/* 41 */                        zzl(i2, zzj(i));
/* 44 */                        i2++;
                            }
/* 46 */                    i++;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zze(zzaxq zzaxqVar) {
/* 5 */             if (zzaxqVar.zzm()) {
/* 7 */                 return;
                    }
/* 8 */             int iZzi = zzi();
/* 12 */            int i = this.zze;
/* 14 */            int i2 = i + i;
/* 15 */            int i3 = iZzi - i2;
/* 20 */            if (!zzm()) {
/* 22 */                int i4 = zzaxqVar.zze;
/* 25 */                if (i3 < i4 + i4) {
/* 27 */                    int i5 = zzaxqVar.zze;
/* 31 */                    zzk(i5 + i5 + i2);
                        }
                    }
/* 34 */            Object[] objArr = zzaxqVar.zzd;
/* 36 */            Object[] objArr2 = this.zzd;
/* 38 */            int i6 = this.zze;
/* 41 */            int i7 = zzaxqVar.zze;
/* 45 */            System.arraycopy(objArr, 0, objArr2, i6 + i6, i7 + i7);
                    this.zze += zzaxqVar.zze;
                }

                public final void zzf(zzaxk zzaxkVar, Object obj) {
/* 3 */             zzgo.zzc(zzaxkVar, "key");
/* 8 */             zzgo.zzc(obj, "value");
/* 11 */            int i = this.zze;
/* 13 */            int i2 = i + i;
/* 14 */            if (i2 == 0 || i2 == zzi()) {
/* 29 */                zzk(Math.max(i2 + i2, 8));
                    }
/* 32 */            int i3 = this.zze;
/* 41 */            this.zzd[i3 + i3] = zzaxkVar.zzg();
/* 43 */            boolean zZzf = zzaxkVar.zzf();
/* 47 */            int i4 = this.zze;
/* 49 */            if (zZzf) {
/* 59 */                zzaxj zzaxjVar = (zzaxj) zzaxkVar.zze(zzaxj.class);
/* 61 */                zzaxjVar.getClass();
/* 67 */                zzl(i4, new zzaxm(zzaxjVar, obj));
                    } else {
/* 80 */                this.zzd[i4 + i4 + 1] = zzaxkVar.zzb(obj);
                    }
                    this.zze++;
                }

                public final Object[] zzh() {
/* 1 */             int i = this.zze;
/* 4 */             Object[] objArr = new Object[i + i];
/* 9 */             for (int i2 = 0; i2 < this.zze; i2++) {
/* 15 */                int i3 = i2 + i2;
/* 17 */                objArr[i3] = zzn(i2);
/* 19 */                Object objZzj = zzj(i2);
/* 25 */                if (!(objZzj instanceof byte[])) {
/* 29 */                    objZzj = ((zzaxm) objZzj).zza();
                        }
/* 35 */                objArr[i3 + 1] = objZzj;
                    }
/* 55 */            return objArr;
                }

/* 8 */         public zzaxq() {
                }
            }
