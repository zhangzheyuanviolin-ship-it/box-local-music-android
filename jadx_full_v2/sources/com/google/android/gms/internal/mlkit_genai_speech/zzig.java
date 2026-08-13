            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.math.RoundingMode;
            import java.util.Objects;
            
/* 25 */    class zzig extends zzih {
                final zzid zzb;
                final Character zzc;

                public zzig(zzid zzidVar, Character ch) {
/* 4 */             this.zzb = zzidVar;
/* 6 */             boolean z = true;
/* 7 */             if (ch != null && zzidVar.zzb('=')) {
/* 18 */                z = false;
                    }
/* 21 */            zzgo.zzj(z, "Padding character %s was already in alphabet", ch);
/* 24 */            this.zzc = ch;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzig) {
/* 6 */                 zzig zzigVar = (zzig) obj;
/* 16 */                if (this.zzb.equals(zzigVar.zzb) && Objects.equals(this.zzc, zzigVar.zzc)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 13 */            return this.zzb.hashCode() ^ Objects.hashCode(this.zzc);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BaseEncoding.");
/* 8 */             zzid zzidVar = this.zzb;
/* 10 */            sb.append(zzidVar);
/* 18 */            if (8 % zzidVar.zzb != 0) {
/* 20 */                Character ch = this.zzc;
/* 22 */                if (ch == null) {
/* 26 */                    sb.append(".omitPadding()");
                        } else {
/* 32 */                    sb.append(".withPadChar('");
/* 35 */                    sb.append(ch);
/* 40 */                    sb.append("')");
                        }
                    }
/* 43 */            return sb.toString();
                }

                public zzih zza(zzid zzidVar, Character ch) {
/* 4 */             return new zzig(zzidVar, null);
                }

                @Override
                public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzgo.zzl(0, i2, bArr.length);
/* 6 */             while (i3 < i2) {
/* 10 */                int i4 = this.zzb.zzd;
/* 18 */                zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
/* 21 */                i3 += i4;
                    }
                }

                @Override
                public final int zzc(int i) {
/* 1 */             zzid zzidVar = this.zzb;
/* 13 */            return zzidVar.zzc * zzil.zza(i, zzidVar.zzd, RoundingMode.CEILING);
                }

                @Override
                public final zzih zzd() {
                    return this.zzc == null ? this : zza(this.zzb, null);
                }

                public final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 4 */             zzgo.zzl(i, i + i2, bArr.length);
/* 7 */             zzid zzidVar = this.zzb;
/* 9 */             int i3 = zzidVar.zzd;
/* 11 */            int i4 = 0;
/* 17 */            zzgo.zze(i2 <= i3);
/* 20 */            long j = 0;
/* 25 */            for (int i5 = 0; i5 < i2; i5++) {
/* 35 */                j = (j | (bArr[i + i5] & 255)) << 8;
                    }
/* 41 */            int i6 = (i2 + 1) * 8;
/* 42 */            int i7 = zzidVar.zzb;
/* 46 */            while (i4 < i2 * 8) {
/* 61 */                appendable.append(zzidVar.zza(zzidVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
/* 64 */                i4 += i7;
                    }
/* 68 */            if (this.zzc != null) {
/* 72 */                while (i4 < i3 * 8) {
/* 76 */                    appendable.append('=');
/* 79 */                    i4 += i7;
                        }
                    }
                }

/* 26 */        public zzig(String str, String str2, Character ch) {
/* 27 */            this(new zzid(str, str2.toCharArray()), ch);
                }
            }
