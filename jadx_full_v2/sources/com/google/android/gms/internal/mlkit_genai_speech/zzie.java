            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            
/* 55 */    final class zzie extends zzig {
                final char[] zza;

                private zzie(zzid zzidVar) {
/* 2 */             super(zzidVar, null);
/* 9 */             this.zza = new char[Barcode.FORMAT_UPC_A];
/* 24 */            zzgo.zze(zzidVar.zzf.length == 16);
/* 29 */            for (int i = 0; i < 256; i++) {
/* 39 */                this.zza[i] = zzidVar.zza(i >>> 4);
/* 51 */                this.zza[i | Barcode.FORMAT_QR_CODE] = zzidVar.zza(i & 15);
                    }
                }

                @Override
                public final zzih zza(zzid zzidVar, Character ch) {
/* 3 */             return new zzie(zzidVar);
                }

                @Override
                public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 3 */             zzgo.zzl(0, i2, bArr.length);
/* 6 */             for (int i3 = 0; i3 < i2; i3++) {
/* 10 */                int i4 = bArr[i3] & 255;
/* 12 */                char[] cArr = this.zza;
/* 16 */                appendable.append(cArr[i4]);
/* 23 */                appendable.append(cArr[i4 | Barcode.FORMAT_QR_CODE]);
                    }
                }

/* 56 */        public zzie(String str, String str2) {
/* 57 */            this(new zzid("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
                }
            }
