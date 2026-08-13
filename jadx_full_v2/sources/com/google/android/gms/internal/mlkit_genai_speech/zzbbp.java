            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            
            public final class zzbbp {
                public static zzaxq zza(Parcel parcel, zzatu zzatuVar) {
/* 1 */             int i = parcel.readInt();
/* 5 */             if (i == 0) {
/* 9 */                 return new zzaxq();
                    }
/* 15 */            Object[] objArr = new Object[i + i];
/* 18 */            int i2 = 0;
/* 19 */            for (int i3 = 0; i3 < i; i3++) {
/* 21 */                int i4 = parcel.readInt();
/* 25 */                int i5 = i2 + 4;
/* 27 */                byte[] bArrZzb = zzb(parcel, i4, i5);
/* 31 */                int i6 = i5 + i4;
/* 32 */                int i7 = i3 + i3;
/* 34 */                objArr[i7] = bArrZzb;
/* 36 */                int i8 = parcel.readInt();
/* 42 */                if (i8 == -1) {
/* 95 */                    throw new zzaze(zzazd.zze.zze("Parcelable metadata values not allowed"), null);
                        }
/* 44 */                if (i8 < 0) {
/* 73 */                    throw new zzaze(zzazd.zzi.zze("Unrecognized metadata sentinel"), null);
                        }
/* 46 */                int i9 = i6 + 4;
/* 48 */                byte[] bArrZzb2 = zzb(parcel, i8, i9);
/* 52 */                i2 = i9 + i8;
/* 55 */                objArr[i7 + 1] = bArrZzb2;
                    }
/* 96 */            return zzawf.zzc(i, objArr);
                }

                private static byte[] zzb(Parcel parcel, int i, int i2) throws zzaze {
/* 4 */             if (i2 + i > 8192) {
/* 98 */                throw new zzaze(zzazd.zzf.zze("Metadata too large"), null);
                    }
/* 6 */             byte[] bArr = new byte[i];
/* 8 */             if (i > 0) {
/* 10 */                parcel.readByteArray(bArr);
                    }
/* 13 */            return bArr;
                }
            }
