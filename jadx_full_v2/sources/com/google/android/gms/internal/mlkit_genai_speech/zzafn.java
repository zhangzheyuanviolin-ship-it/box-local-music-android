            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            import java.util.Map;
            
            final class zzafn implements zzajb {
                private final zzafm zza;

                private zzafn(zzafm zzafmVar) {
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             this.zza = zzafmVar;
/* 8 */             zzafmVar.zza = this;
                }

                public static zzafn zza(zzafm zzafmVar) {
/* 1 */             Object obj = zzafmVar.zza;
                    return obj != null ? (zzafn) obj : new zzafn(zzafmVar);
                }

                @Override
                public final void zzA(int i, long j) {
/* 3 */             this.zza.zzj(i, j);
                }

                @Override
                public final void zzB(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzahb)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzj(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 71 */                zzafm zzafmVar = this.zza;
/* 73 */                zzafmVar.zzs(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzafmVar.zzu(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzafmVar.zzk(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzahb zzahbVar = (zzahb) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzahbVar.size()) {
/* 63 */                    this.zza.zzj(i, zzahbVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzahbVar.size(); i6++) {
/* 24 */                zzahbVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzahbVar.size()) {
/* 45 */                zzafmVar2.zzk(zzahbVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override
                public final void zzC(int i, int i2) {
/* 6 */             zzafm zzafmVar = this.zza;
/* 8 */             zzafmVar.zzt(i, (i2 >> 31) ^ (i2 + i2));
                }

                @Override
                public final void zzD(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 88 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 162 */                       zzafm zzafmVar = this.zza;
/* 170 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 179 */                       zzafmVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 182 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 90 */                zzafm zzafmVar2 = this.zza;
/* 92 */                zzafmVar2.zzs(i, 2);
/* 96 */                int iZzy = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iZzy += zzafm.zzy((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               zzafmVar2.zzu(iZzy);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   zzafmVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 69 */                while (i2 < zzaghVar.size()) {
/* 71 */                    zzafm zzafmVar3 = this.zza;
/* 73 */                    int iZze = zzaghVar.zze(i2);
/* 82 */                    zzafmVar3.zzt(i, (iZze >> 31) ^ (iZze + iZze));
/* 85 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar4 = this.zza;
/* 13 */            zzafmVar4.zzs(i, 2);
/* 17 */            int iZzy2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
/* 24 */                int iZze2 = zzaghVar.zze(i4);
/* 37 */                iZzy2 += zzafm.zzy((iZze2 >> 31) ^ (iZze2 + iZze2));
                    }
/* 41 */            zzafmVar4.zzu(iZzy2);
/* 48 */            while (i2 < zzaghVar.size()) {
/* 50 */                int iZze3 = zzaghVar.zze(i2);
/* 59 */                zzafmVar4.zzu((iZze3 >> 31) ^ (iZze3 + iZze3));
/* 62 */                i2++;
                    }
                }

                @Override
                public final void zzE(int i, long j) {
/* 7 */             zzafm zzafmVar = this.zza;
/* 9 */             zzafmVar.zzv(i, (j >> 63) ^ (j + j));
                }

                @Override
                public final void zzF(int i, List list, boolean z) {
/* 6 */             int i2 = 0;
/* 7 */             if (!(list instanceof zzahb)) {
/* 87 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 159 */                       zzafm zzafmVar = this.zza;
/* 167 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 175 */                       zzafmVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 178 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 89 */                zzafm zzafmVar2 = this.zza;
/* 91 */                zzafmVar2.zzs(i, 2);
/* 95 */                int iZzz = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iZzz += zzafm.zzz((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               zzafmVar2.zzu(iZzz);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   zzafmVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 9 */             zzahb zzahbVar = (zzahb) list;
/* 11 */            if (!z) {
/* 69 */                while (i2 < zzahbVar.size()) {
/* 71 */                    zzafm zzafmVar3 = this.zza;
/* 73 */                    long jZze = zzahbVar.zze(i2);
/* 81 */                    zzafmVar3.zzv(i, (jZze >> 63) ^ (jZze + jZze));
/* 84 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 13 */            zzafm zzafmVar4 = this.zza;
/* 15 */            zzafmVar4.zzs(i, 2);
/* 19 */            int iZzz2 = 0;
/* 24 */            for (int i4 = 0; i4 < zzahbVar.size(); i4++) {
/* 26 */                long jZze2 = zzahbVar.zze(i4);
/* 38 */                iZzz2 += zzafm.zzz((jZze2 >> 63) ^ (jZze2 + jZze2));
                    }
/* 42 */            zzafmVar4.zzu(iZzz2);
/* 49 */            while (i2 < zzahbVar.size()) {
/* 51 */                long jZze3 = zzahbVar.zze(i2);
/* 59 */                zzafmVar4.zzw((jZze3 >> 63) ^ (jZze3 + jZze3));
/* 62 */                i2++;
                    }
                }

                @Override
                @Deprecated
                public final void zzG(int i) {
/* 4 */             this.zza.zzs(i, 3);
                }

                @Override
                public final void zzH(int i, String str) {
/* 3 */             this.zza.zzq(i, str);
                }

                @Override
                public final void zzI(int i, List list) {
/* 3 */             int i2 = 0;
/* 4 */             if (!(list instanceof zzagy)) {
/* 43 */                while (i2 < list.size()) {
/* 53 */                    this.zza.zzq(i, (String) list.get(i2));
/* 56 */                    i2++;
                        }
/* 106 */               return;
                    }
/* 7 */             zzagy zzagyVar = (zzagy) list;
/* 13 */            while (i2 < list.size()) {
/* 15 */                Object objZzb = zzagyVar.zzb();
/* 19 */                boolean z = objZzb instanceof String;
/* 21 */                zzafm zzafmVar = this.zza;
/* 23 */                if (z) {
/* 27 */                    zzafmVar.zzq(i, (String) objZzb);
                        } else {
/* 33 */                    zzafmVar.zzf(i, (zzafd) objZzb);
                        }
/* 36 */                i2++;
                    }
                }

                @Override
                public final void zzJ(int i, int i2) {
/* 3 */             this.zza.zzt(i, i2);
                }

                @Override
                public final void zzK(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 75 */                zzafm zzafmVar = this.zza;
/* 77 */                zzafmVar.zzs(i, 2);
/* 81 */                int iZzy = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzy += zzafm.zzy(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               zzafmVar.zzu(iZzy);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzafmVar.zzu(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzaghVar.size()) {
/* 67 */                    this.zza.zzt(i, zzaghVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int iZzy2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
/* 32 */                iZzy2 += zzafm.zzy(zzaghVar.zze(i4));
                    }
/* 36 */            zzafmVar2.zzu(iZzy2);
/* 43 */            while (i2 < zzaghVar.size()) {
/* 49 */                zzafmVar2.zzu(zzaghVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override
                public final void zzL(int i, long j) {
/* 3 */             this.zza.zzv(i, j);
                }

                @Override
                public final void zzM(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzahb)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzv(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 75 */                zzafm zzafmVar = this.zza;
/* 77 */                zzafmVar.zzs(i, 2);
/* 81 */                int iZzz = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzz += zzafm.zzz(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzafmVar.zzu(iZzz);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzafmVar.zzw(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzahb zzahbVar = (zzahb) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzahbVar.size()) {
/* 67 */                    this.zza.zzv(i, zzahbVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzahbVar.size(); i4++) {
/* 32 */                iZzz2 += zzafm.zzz(zzahbVar.zze(i4));
                    }
/* 36 */            zzafmVar2.zzu(iZzz2);
/* 43 */            while (i2 < zzahbVar.size()) {
/* 49 */                zzafmVar2.zzw(zzahbVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override
                public final void zzb(int i, boolean z) {
/* 3 */             this.zza.zzd(i, z);
                }

                @Override
                public final void zzc(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzaet)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
/* 144 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 71 */                zzafm zzafmVar = this.zza;
/* 73 */                zzafmVar.zzs(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Boolean) list.get(i4)).getClass();
/* 93 */                    i3++;
                        }
/* 98 */                zzafmVar.zzu(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzafmVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 120 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzaet zzaetVar = (zzaet) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzaetVar.size()) {
/* 63 */                    this.zza.zzd(i, zzaetVar.zzf(i2));
/* 66 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzaetVar.size(); i6++) {
/* 24 */                zzaetVar.zzf(i6);
/* 27 */                i5++;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzaetVar.size()) {
/* 45 */                zzafmVar2.zzb(zzaetVar.zzf(i2) ? (byte) 1 : (byte) 0);
/* 48 */                i2++;
                    }
                }

                @Override
                public final void zzd(int i, zzafd zzafdVar) {
/* 3 */             this.zza.zzf(i, zzafdVar);
                }

                @Override
                public final void zze(int i, List list) {
/* 6 */             for (int i2 = 0; i2 < list.size(); i2++) {
/* 16 */                this.zza.zzf(i, (zzafd) list.get(i2));
                    }
                }

                @Override
                public final void zzf(int i, double d) {
/* 7 */             this.zza.zzj(i, Double.doubleToRawLongBits(d));
                }

                @Override
                public final void zzg(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzafo)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 160 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 79 */                zzafm zzafmVar = this.zza;
/* 81 */                zzafmVar.zzs(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Double) list.get(i4)).getClass();
/* 101 */                   i3 += 8;
                        }
/* 106 */               zzafmVar.zzu(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzafmVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 132 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzafo zzafoVar = (zzafo) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzafoVar.size()) {
/* 71 */                    this.zza.zzj(i, Double.doubleToRawLongBits(zzafoVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzafoVar.size(); i6++) {
/* 24 */                zzafoVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzafoVar.size()) {
/* 49 */                zzafmVar2.zzk(Double.doubleToRawLongBits(zzafoVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override
                @Deprecated
                public final void zzh(int i) {
/* 4 */             this.zza.zzs(i, 4);
                }

                @Override
                public final void zzi(int i, int i2) {
/* 3 */             this.zza.zzl(i, i2);
                }

                @Override
                public final void zzj(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 76 */                zzafm zzafmVar = this.zza;
/* 78 */                zzafmVar.zzs(i, 2);
/* 82 */                int iZzz = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzz += zzafm.zzz(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzafmVar.zzu(iZzz);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzafmVar.zzm(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzaghVar.size()) {
/* 68 */                    this.zza.zzl(i, zzaghVar.zze(i2));
/* 71 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
/* 33 */                iZzz2 += zzafm.zzz(zzaghVar.zze(i4));
                    }
/* 37 */            zzafmVar2.zzu(iZzz2);
/* 44 */            while (i2 < zzaghVar.size()) {
/* 50 */                zzafmVar2.zzm(zzaghVar.zze(i2));
/* 53 */                i2++;
                    }
                }

                @Override
                public final void zzk(int i, int i2) {
/* 3 */             this.zza.zzh(i, i2);
                }

                @Override
                public final void zzl(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 71 */                zzafm zzafmVar = this.zza;
/* 73 */                zzafmVar.zzs(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzafmVar.zzu(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzafmVar.zzi(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzaghVar.size()) {
/* 63 */                    this.zza.zzh(i, zzaghVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzaghVar.size(); i6++) {
/* 24 */                zzaghVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzaghVar.size()) {
/* 45 */                zzafmVar2.zzi(zzaghVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override
                public final void zzm(int i, long j) {
/* 3 */             this.zza.zzj(i, j);
                }

                @Override
                public final void zzn(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzahb)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzj(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 71 */                zzafm zzafmVar = this.zza;
/* 73 */                zzafmVar.zzs(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzafmVar.zzu(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzafmVar.zzk(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzahb zzahbVar = (zzahb) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzahbVar.size()) {
/* 63 */                    this.zza.zzj(i, zzahbVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzahbVar.size(); i6++) {
/* 24 */                zzahbVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzahbVar.size()) {
/* 45 */                zzafmVar2.zzk(zzahbVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override
                public final void zzo(int i, float f) {
/* 7 */             this.zza.zzh(i, Float.floatToRawIntBits(f));
                }

                @Override
                public final void zzp(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzafy)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 160 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 79 */                zzafm zzafmVar = this.zza;
/* 81 */                zzafmVar.zzs(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Float) list.get(i4)).getClass();
/* 101 */                   i3 += 4;
                        }
/* 106 */               zzafmVar.zzu(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzafmVar.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 132 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzafy zzafyVar = (zzafy) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzafyVar.size()) {
/* 71 */                    this.zza.zzh(i, Float.floatToRawIntBits(zzafyVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzafyVar.size(); i6++) {
/* 24 */                zzafyVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzafyVar.size()) {
/* 49 */                zzafmVar2.zzi(Float.floatToRawIntBits(zzafyVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override
                public final void zzq(int i, Object obj, zzaia zzaiaVar) {
/* 1 */             zzafm zzafmVar = this.zza;
/* 6 */             zzafmVar.zzs(i, 3);
/* 9 */             zzaiaVar.zzg((zzaeo) obj, this);
/* 13 */            zzafmVar.zzs(i, 4);
                }

                @Override
                public final void zzr(int i, int i2) {
/* 3 */             this.zza.zzl(i, i2);
                }

                @Override
                public final void zzs(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 76 */                zzafm zzafmVar = this.zza;
/* 78 */                zzafmVar.zzs(i, 2);
/* 82 */                int iZzz = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzz += zzafm.zzz(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzafmVar.zzu(iZzz);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzafmVar.zzm(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzaghVar.size()) {
/* 68 */                    this.zza.zzl(i, zzaghVar.zze(i2));
/* 71 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzaghVar.size(); i4++) {
/* 33 */                iZzz2 += zzafm.zzz(zzaghVar.zze(i4));
                    }
/* 37 */            zzafmVar2.zzu(iZzz2);
/* 44 */            while (i2 < zzaghVar.size()) {
/* 50 */                zzafmVar2.zzm(zzaghVar.zze(i2));
/* 53 */                i2++;
                    }
                }

                @Override
                public final void zzt(int i, long j) {
/* 3 */             this.zza.zzv(i, j);
                }

                @Override
                public final void zzu(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzahb)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzv(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 75 */                zzafm zzafmVar = this.zza;
/* 77 */                zzafmVar.zzs(i, 2);
/* 81 */                int iZzz = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzz += zzafm.zzz(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzafmVar.zzu(iZzz);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzafmVar.zzw(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzahb zzahbVar = (zzahb) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzahbVar.size()) {
/* 67 */                    this.zza.zzv(i, zzahbVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzahbVar.size(); i4++) {
/* 32 */                iZzz2 += zzafm.zzz(zzahbVar.zze(i4));
                    }
/* 36 */            zzafmVar2.zzu(iZzz2);
/* 43 */            while (i2 < zzahbVar.size()) {
/* 49 */                zzafmVar2.zzw(zzahbVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override
                public final void zzv(int i, zzahf zzahfVar, Map map) {
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 21 */                zzafm zzafmVar = this.zza;
/* 24 */                zzafmVar.zzs(i, 2);
/* 39 */                zzafmVar.zzu(zzahg.zzb(zzahfVar, entry.getKey(), entry.getValue()));
/* 50 */                zzahg.zze(zzafmVar, zzahfVar, entry.getKey(), entry.getValue());
                    }
                }

                @Override
                public final void zzw(int i, Object obj, zzaia zzaiaVar) {
/* 1 */             zzafm zzafmVar = this.zza;
/* 3 */             zzaeo zzaeoVar = (zzaeo) obj;
/* 6 */             zzafmVar.zzs(i, 2);
/* 13 */            zzafmVar.zzu(zzaeoVar.zzj(zzaiaVar));
/* 16 */            zzaiaVar.zzg(zzaeoVar, this);
                }

                @Override
                public final void zzx(int i, Object obj) {
/* 1 */             boolean z = obj instanceof zzafd;
/* 3 */             zzafm zzafmVar = this.zza;
/* 5 */             if (z) {
/* 9 */                 zzafmVar.zzp(i, (zzafd) obj);
                    } else {
/* 15 */                zzafmVar.zzo(i, (zzahn) obj);
                    }
                }

                @Override
                public final void zzy(int i, int i2) {
/* 3 */             this.zza.zzh(i, i2);
                }

                @Override
                public final void zzz(int i, List list, boolean z) {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzagh)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 408 */                   return;
                        }
/* 71 */                zzafm zzafmVar = this.zza;
/* 73 */                zzafmVar.zzs(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzafmVar.zzu(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzafmVar.zzi(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 408 */               return;
                    }
/* 7 */             zzagh zzaghVar = (zzagh) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzaghVar.size()) {
/* 63 */                    this.zza.zzh(i, zzaghVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 408 */               return;
                    }
/* 11 */            zzafm zzafmVar2 = this.zza;
/* 13 */            zzafmVar2.zzs(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzaghVar.size(); i6++) {
/* 24 */                zzaghVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzafmVar2.zzu(i5);
/* 39 */            while (i2 < zzaghVar.size()) {
/* 45 */                zzafmVar2.zzi(zzaghVar.zze(i2));
/* 48 */                i2++;
                    }
                }
            }
