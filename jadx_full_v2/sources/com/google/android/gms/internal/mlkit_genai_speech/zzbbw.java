            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            import java.io.InputStream;
            import java.util.concurrent.TimeUnit;
            
            final class zzbbw extends zzbby {
                private final zzaxv zza;
                private final zzaxq zzb;
                private final zzbng zzc;

                public zzbbw(zzbat zzbatVar, int i, zzaxv zzaxvVar, zzaxq zzaxqVar, zzbng zzbngVar) {
/* 2 */             super(zzbatVar, i, zzbngVar, null);
/* 5 */             this.zza = zzaxvVar;
/* 7 */             this.zzb = zzaxqVar;
/* 9 */             this.zzc = zzbngVar;
                }

                @Override
                public final int zza(Parcel parcel) {
                    int length;
                    int i;
/* 1 */             zzaxv zzaxvVar = this.zza;
/* 7 */             parcel.writeString(zzaxvVar.zzf());
/* 10 */            zzaxq zzaxqVar = this.zzb;
/* 12 */            int iZza = zzawf.zza(zzaxqVar);
/* 17 */            if (iZza == 0) {
/* 19 */                parcel.writeInt(0);
                    } else {
/* 24 */                Object[] objArrZzd = zzawf.zzd(zzaxqVar);
/* 28 */                parcel.writeInt(iZza);
/* 32 */                for (int i2 = 0; i2 < iZza; i2++) {
/* 34 */                    int i3 = i2 + i2;
/* 38 */                    byte[] bArr = (byte[]) objArrZzd[i3];
/* 41 */                    parcel.writeInt(bArr.length);
/* 44 */                    parcel.writeByteArray(bArr);
/* 49 */                    Object obj = objArrZzd[i3 + 1];
/* 53 */                    if (obj instanceof byte[]) {
/* 55 */                        byte[] bArr2 = (byte[]) obj;
/* 58 */                        parcel.writeInt(bArr2.length);
/* 61 */                        parcel.writeByteArray(bArr2);
                            } else if (obj instanceof zzbca) {
/* 70 */                        parcel.writeInt(-1);
/* 75 */                        ((zzbca) obj).zza(parcel);
                            } else {
/* 79 */                        byte[] bArrZzb = zzbav.zzb();
                                try {
/* 83 */                            InputStream inputStream = (InputStream) obj;
/* 85 */                            int i4 = 0;
                                    while (true) {
/* 86 */                                length = bArrZzb.length;
/* 87 */                                if (i4 >= length || (i = inputStream.read(bArrZzb, i4, length - i4)) == -1) {
                                            break;
                                        }
/* 98 */                                i4 += i;
                                    }
/* 102 */                           if (i4 == length) {
/* 132 */                               throw new zzaze(zzazd.zzf.zze("Metadata value too large"), null);
                                    }
/* 104 */                           parcel.writeInt(i4);
/* 107 */                           if (i4 > 0) {
/* 109 */                               parcel.writeByteArray(bArrZzb, 0, i4);
                                    }
/* 112 */                           zzbav.zza(bArrZzb);
                                } catch (Throwable th) {
/* 133 */                           zzbav.zza(bArrZzb);
/* 136 */                           throw th;
                                }
                            }
                        }
                    }
/* 139 */           this.zzc.zzd();
/* 142 */           zzaxt zzaxtVarZzb = zzaxvVar.zzb();
                    return (zzaxtVarZzb == zzaxt.UNARY || zzaxtVarZzb == zzaxt.CLIENT_STREAMING) ? 16 : 0;
                }

                public final void zzb(zzavf zzavfVar) {
/* 1 */             zzaxq zzaxqVar = this.zzb;
/* 3 */             zzaxk zzaxkVar = zzbgr.zza;
/* 5 */             zzaxqVar.zzd(zzaxkVar);
/* 18 */            zzaxqVar.zzf(zzaxkVar, Long.valueOf(zzavfVar.zzb(TimeUnit.NANOSECONDS)));
                }
            }
