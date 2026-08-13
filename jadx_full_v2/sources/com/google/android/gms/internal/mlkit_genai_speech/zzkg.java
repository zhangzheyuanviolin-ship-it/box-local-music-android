            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import p000.IlIO00o1;
            import p000.OoloiiOiiil;
            import p000.iilo0lOo110;
            
/* 12 */    final class zzkg implements OoloiiOiiil {
                private boolean zza = false;
                private boolean zzb = false;
                private IlIO00o1 zzc;
                private final zzkc zzd;

                public zzkg(zzkc zzkcVar) {
/* 9 */             this.zzd = zzkcVar;
                }

                private final void zzb() {
/* 3 */             if (this.zza) {
/* 11 */                iilo0lOo110.I0000O("Cannot encode a second value in the ValueEncoderContext");
                    } else {
/* 6 */                 this.zza = true;
                    }
                }

                public final OoloiiOiiil add(double d) throws IOException {
/* 1 */             zzb();
/* 10 */            this.zzd.zza(this.zzc, d, this.zzb);
/* 29 */            return this;
                }

                public final void zza(IlIO00o1 ilIO00o1, boolean z) {
/* 2 */             this.zza = false;
/* 4 */             this.zzc = ilIO00o1;
/* 6 */             this.zzb = z;
                }

/* 13 */        public final OoloiiOiiil add(float f) throws IOException {
/* 14 */            zzb();
/* 15 */            this.zzd.zzb(this.zzc, f, this.zzb);
                    return this;
                }

/* 15 */        public final OoloiiOiiil add(int i) throws IOException {
/* 16 */            zzb();
/* 17 */            this.zzd.zzd(this.zzc, i, this.zzb);
                    return this;
                }

/* 17 */        public final OoloiiOiiil add(long j) throws IOException {
/* 18 */            zzb();
/* 19 */            this.zzd.zze(this.zzc, j, this.zzb);
                    return this;
                }

                @Override
/* 19 */        public final OoloiiOiiil add(String str) throws IOException {
/* 20 */            zzb();
/* 21 */            this.zzd.zzc(this.zzc, str, this.zzb);
                    return this;
                }

                @Override
/* 21 */        public final OoloiiOiiil add(boolean z) throws IOException {
/* 22 */            zzb();
/* 23 */            this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
                    return this;
                }

/* 23 */        public final OoloiiOiiil add(byte[] bArr) throws IOException {
/* 24 */            zzb();
/* 25 */            this.zzd.zzc(this.zzc, bArr, this.zzb);
                    return this;
                }
            }
