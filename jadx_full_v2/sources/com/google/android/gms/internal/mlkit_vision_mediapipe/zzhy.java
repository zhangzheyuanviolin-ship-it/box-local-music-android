            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            import p000.IOOlIIilOl0;
            import p000.lI1i1lI0O0I;
            import p000.lIIOO0oi1o;
            import p000.lIi0II001O1I;
            import p000.lO11l0OoOIIi;
            import p000.lOOOIoiiilo;
            
            public final class zzhy {
                public static int zza(zzhv zzhvVar) {
/* 5 */             return zzf(zzhvVar.zza());
                }

                public static int zzb(zzhv zzhvVar) {
/* 5 */             return zzg(zzhvVar.zza());
                }

                public static List zzc(zzhv zzhvVar, lO11l0OoOIIi lo11l0oooiii) throws lIi0II001O1I {
/* 5 */             byte[][] bArrZzj = zzj(zzhvVar.zza());
/* 9 */             if (bArrZzj == null) {
/* 78 */                IOOlIIilOl0.I000II("Vector of protocol buffer objects should not be null!");
/* 81 */                return null;
                    }
                    try {
/* 13 */                ArrayList arrayList = new ArrayList();
/* 18 */                for (byte[] bArr : bArrZzj) {
/* 23 */                    lI1i1lI0O0I li1i1li0o0i = (lI1i1lI0O0I) lo11l0oooiii;
/* 25 */                    li1i1li0o0i.getClass();
/* 33 */                    lIIOO0oi1o liioo0oi1oI000iOII = lIIOO0oi1o.I000iOII(li1i1li0o0i.I00000oIO, bArr, bArr.length, lI1i1lI0O0I.I00000oOI);
/* 37 */                    if (liioo0oi1oI000iOII != null && !lIIOO0oi1o.I000II(liioo0oi1oI000iOII, true)) {
/* 61 */                        throw new lIi0II001O1I(new lOOOIoiiilo().getMessage());
                            }
/* 62 */                    arrayList.add(liioo0oi1oI000iOII);
                        }
/* 68 */                return arrayList;
                    } catch (lIi0II001O1I e) {
/* 75 */                throw new IllegalArgumentException(e);
                    }
                }

                public static boolean zzd(zzhv zzhvVar, ByteBuffer byteBuffer) {
/* 5 */             return zzh(zzhvVar.zza(), byteBuffer);
                }

                public static byte[] zze(zzhv zzhvVar) {
/* 5 */             return zzi(zzhvVar.zza());
                }

                private static native int zzf(long j);

                private static native int zzg(long j);

                private static native boolean zzh(long j, ByteBuffer byteBuffer);

                private static native byte[] zzi(long j);

                private static native byte[][] zzj(long j);
            }
