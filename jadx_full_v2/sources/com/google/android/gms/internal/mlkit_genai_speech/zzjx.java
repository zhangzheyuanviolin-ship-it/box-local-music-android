            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.OutputStream;
            import p000.OoOil11Ol1o;
            
/* 22 */    final class zzjx extends OutputStream {
                private long zza = 0;

                @Override
                public final void write(byte[] bArr, int i, int i2) {
                    int length;
                    int i3;
/* 1 */             if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
/* 20 */                OoOil11Ol1o.I001i1lo1io();
                    } else {
                        this.zza += i2;
                    }
                }

                public final long zza() {
/* 1 */             return this.zza;
                }

                @Override
/* 23 */        public final void write(byte[] bArr) {
                    this.zza += bArr.length;
                }

                @Override
/* 24 */        public final void write(int i) {
                    this.zza++;
                }
            }
