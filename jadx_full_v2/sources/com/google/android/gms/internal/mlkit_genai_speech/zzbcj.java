            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            
            final class zzbcj {
                private zzbcj() {
                }

                public static zzazd zza(int i, Parcel parcel) {
/* 1 */             int i2 = i >> 16;
/* 3 */             int i3 = i & 32;
/* 7 */             zzazd zzazdVarZzb = zzazd.zzb(i2 & 255);
                    return i3 != 0 ? zzazdVarZzb.zze(parcel.readString()) : zzazdVarZzb;
                }

                public static void zzb(Parcel parcel, int i) {
/* 1 */             int iDataPosition = parcel.dataPosition();
/* 6 */             parcel.setDataPosition(0);
/* 9 */             parcel.writeInt(i);
/* 12 */            parcel.setDataPosition(iDataPosition);
                }

                public static boolean zzc(int i, int i2) {
                    return (i & i2) != 0;
                }
            }
