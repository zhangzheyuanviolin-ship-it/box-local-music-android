            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.ref.Reference;
            import java.lang.ref.WeakReference;
            import p000.IioIoO10iOiI;
            
            final class zzboh implements zzaxs {
                private static final ThreadLocal zza = new ThreadLocal();
                private final zzahv zzb;
                private final zzahn zzc;

                public zzboh(zzahn zzahnVar, int i) {
/* 6 */             zzgo.zzc(zzahnVar, "defaultInstance cannot be null");
/* 9 */             this.zzc = zzahnVar;
/* 15 */            this.zzb = zzahnVar.zzy();
                }

                @Override
                public final InputStream zza(Object obj) {
/* 7 */             return new zzbog((zzahn) obj, this.zzb);
                }

                @Override
                public final Object zzb(InputStream inputStream) throws IOException {
                    zzafh zzafhVarZzI;
                    byte[] bArr;
                    try {
/* 2 */                 int iAvailable = inputStream.available();
/* 7 */                 if (iAvailable > 0 && iAvailable <= 4194304) {
/* 13 */                    ThreadLocal threadLocal = zza;
/* 19 */                    Reference reference = (Reference) threadLocal.get();
/* 21 */                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
/* 38 */                        bArr = new byte[iAvailable];
/* 45 */                        threadLocal.set(new WeakReference(bArr));
                            }
/* 48 */                    int i = iAvailable;
/* 49 */                    while (i > 0) {
/* 53 */                        int i2 = inputStream.read(bArr, iAvailable - i, i);
/* 58 */                        if (i2 == -1) {
                                    break;
                                }
/* 61 */                        i -= i2;
                            }
/* 63 */                    if (i != 0) {
/* 102 */                       throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                            }
/* 65 */                    zzafhVarZzI = zzafh.zzJ(bArr, 0, iAvailable);
                        } else {
/* 103 */                   if (iAvailable == 0) {
/* 105 */                       return this.zzc;
                            }
/* 108 */                   zzafhVarZzI = null;
                        }
/* 109 */               if (zzafhVarZzI == null) {
/* 113 */                   zzafhVarZzI = zzafh.zzI(inputStream, Barcode.FORMAT_AZTEC);
                        }
/* 120 */               zzafhVarZzI.zzG(Integer.MAX_VALUE);
                        try {
/* 131 */                   zzahn zzahnVar = (zzahn) this.zzb.zza(zzafhVarZzI, zzboi.zza);
                            try {
/* 133 */                       zzafhVarZzI.zzz(0);
/* 136 */                       return zzahnVar;
                            } catch (zzagr e) {
/* 138 */                       throw e;
                            }
                        } catch (zzagr e2) {
/* 157 */                   throw new zzazg(zzazd.zzi.zze("Invalid protobuf byte sequence").zzd(e2), null);
                        }
                    } catch (IOException e3) {
/* 158 */               IioIoO10iOiI.I000lI(e3);
/* 1 */                 return null;
                    }
                }
            }
