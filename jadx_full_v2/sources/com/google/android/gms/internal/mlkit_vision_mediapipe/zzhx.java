            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.OIiilo1Ool0o;
            import p000.l0oioo1oO;
            import p000.l1010iiiO1;
            import p000.l1Ii10o;
            import p000.lIoolOoilO;
            
            public class zzhx {
                protected final zzhp zza;

                public zzhx(zzhp zzhpVar) {
/* 4 */             this.zza = zzhpVar;
                }

                private final native long zza(long j, boolean z);

                private final native long zzh(long j, float f);

                private final native long zzi(long j, int i);

                private final native long zzj(long j, zzib zzibVar);

                private final native long zzk(long j, ByteBuffer byteBuffer, int i, int i2);

                private final native long zzl(long j, String str);

                private void zzm(long j, l1010iiiO1 l1010iiio1) {
/* 1 */             l1010iiio1.zzf();
                }

                public final zzhv zzb(boolean z) {
/* 11 */            return zzhv.zzd(zza(this.zza.zza(), z));
                }

                public final zzhv zzc(float f) {
/* 11 */            return zzhv.zzd(zzh(this.zza.zza(), f));
                }

                public final zzhv zzd(int i) {
/* 11 */            return zzhv.zzd(zzi(this.zza.zza(), i));
                }

                public final zzhv zze(lIoolOoilO lioolooilo) {
/* 3 */             zzib zzibVar = new zzib();
/* 20 */            String str = (String) ((HashMap) l0oioo1oO.I00000oIO.I00iiI).get(lioolooilo.getClass());
/* 22 */            zzibVar.zza = str;
/* 24 */            if (str != null) {
/* 28 */                ((l1Ii10o) lioolooilo).I00000oOI();
/* 41 */                return zzhv.zzd(zzj(this.zza.zza(), zzibVar));
                    }
/* 62 */            OIiilo1Ool0o.I000II(IlIi0I0.I000lI("Cannot determine the protobuf type name for class: ", String.valueOf(lioolooilo.getClass()), ". Have you called ProtoUtil.registerTypeName?"));
/* 65 */            return null;
                }

                public final zzhv zzf(ByteBuffer byteBuffer, int i, int i2) {
/* 9 */             int i3 = (((i * 3) + 3) / 4) * 4 * i2;
/* 14 */            if (i3 == byteBuffer.capacity()) {
/* 30 */                return zzhv.zzd(zzk(this.zza.zza(), byteBuffer, i, i2));
                    }
/* 48 */            I000II.I000iOII(IIl001iO0Io.I000l1(i3, byteBuffer.capacity(), "The size of the buffer should be: ", " but is "));
/* 51 */            return null;
                }

                public final zzhv zzg(String str) {
/* 11 */            return zzhv.zzd(zzl(this.zza.zza(), str));
                }
            }
