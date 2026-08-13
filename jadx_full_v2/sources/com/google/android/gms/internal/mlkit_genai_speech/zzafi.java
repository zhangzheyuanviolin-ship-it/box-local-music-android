            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            import java.util.Map;
            import p000.I000II;
            import p000.OoOil11Ol1o;
            
            final class zzafi implements zzahz {
                private final zzafh zza;
                private int zzb;
                private int zzc;
                private int zzd = 0;

                private zzafi(zzafh zzafhVar) {
/* 7 */             byte[] bArr = zzagp.zzb;
/* 9 */             this.zza = zzafhVar;
/* 11 */            zzafhVar.zze = this;
                }

                private final Object zzS(zzaiz zzaizVar, Class cls, zzafr zzafrVar) {
/* 1 */             zzaiz zzaizVar2 = zzaiz.zza;
                    switch (zzaizVar.ordinal()) {
                        case 0:
/* 153 */                   return Double.valueOf(zza());
                        case 1:
/* 144 */                   return Float.valueOf(zzb());
                        case 2:
/* 135 */                   return Long.valueOf(zzl());
                        case 3:
/* 126 */                   return Long.valueOf(zzo());
                        case 4:
/* 117 */                   return Integer.valueOf(zzg());
                        case 5:
/* 108 */                   return Long.valueOf(zzk());
                        case 6:
/* 99 */                    return Integer.valueOf(zzf());
                        case 7:
/* 90 */                    return Boolean.valueOf(zzQ());
                        case 8:
/* 81 */                    return zzu();
                        case 9:
                        default:
/* 12 */                    I000II.I000iOII("unsupported field type.");
/* 15 */                    return null;
                        case 10:
/* 76 */                    return zzs(cls, zzafrVar);
                        case 11:
/* 71 */                    return zzp();
                        case 12:
/* 66 */                    return Integer.valueOf(zzj());
                        case 13:
/* 57 */                    return Integer.valueOf(zze());
                        case 14:
/* 48 */                    return Integer.valueOf(zzh());
                        case 15:
/* 39 */                    return Long.valueOf(zzm());
                        case 16:
/* 30 */                    return Integer.valueOf(zzi());
                        case 17:
/* 21 */                    return Long.valueOf(zzn());
                    }
                }

                private final Object zzT(zzaia zzaiaVar, zzafr zzafrVar) {
/* 1 */             Object objZzc = zzaiaVar.zzc();
/* 5 */             zzV(objZzc, zzaiaVar, zzafrVar);
/* 8 */             zzaiaVar.zzd(objZzc);
/* 37 */            return objZzc;
                }

                private final Object zzU(zzaia zzaiaVar, zzafr zzafrVar) throws zzagr {
/* 1 */             Object objZzc = zzaiaVar.zzc();
/* 5 */             zzW(objZzc, zzaiaVar, zzafrVar);
/* 8 */             zzaiaVar.zzd(objZzc);
/* 37 */            return objZzc;
                }

                private final void zzV(Object obj, zzaia zzaiaVar, zzafr zzafrVar) {
/* 1 */             int i = this.zzc;
/* 11 */            this.zzc = ((this.zzb >>> 3) << 3) | 4;
                    try {
/* 13 */                zzaiaVar.zzf(obj, this, zzafrVar);
/* 20 */                if (this.zzb == this.zzc) {
                        } else {
/* 32 */                    throw new zzagr("Failed to parse the message.");
                        }
                    } finally {
/* 34 */                this.zzc = i;
                    }
                }

                private final void zzW(Object obj, zzaia zzaiaVar, zzafr zzafrVar) throws zzagr {
/* 1 */             zzafh zzafhVar = this.zza;
/* 3 */             int iZzn = zzafhVar.zzn();
/* 7 */             zzafhVar.zzL();
/* 10 */            int iZze = zzafhVar.zze(iZzn);
                    zzafhVar.zza++;
/* 20 */            zzaiaVar.zzf(obj, this, zzafrVar);
/* 24 */            zzafhVar.zzz(0);
                    zzafhVar.zza--;
/* 33 */            zzafhVar.zzA(iZze);
                }

                private final void zzX(int i) throws zzagr {
/* 7 */             if (this.zza.zzd() == i) {
/* 9 */                 return;
                    }
/* 12 */            OoOil11Ol1o.I001i1O0Ol("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                private final void zzY(int i) throws zzagq {
/* 5 */             if ((this.zzb & 7) == i) {
/* 7 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I00111O();
                }

                private static final void zzZ(int i) throws zzagr {
/* 3 */             if ((i & 3) == 0) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001i1O0Ol("Failed to parse the message.");
                }

                private static final void zzaa(int i) throws zzagr {
/* 3 */             if ((i & 7) == 0) {
/* 5 */                 return;
                    }
/* 8 */             OoOil11Ol1o.I001i1O0Ol("Failed to parse the message.");
                }

                public static zzafi zzq(zzafh zzafhVar) {
/* 1 */             Object obj = zzafhVar.zze;
                    return obj != null ? (zzafi) obj : new zzafi(zzafhVar);
                }

                @Override
                public final void zzA(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzagh zzaghVar = (zzagh) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzaghVar.zzg(zzafhVar.zzf());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzaghVar.zzg(zzafhVar2.zzf());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzafhVar3.zzf()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzafhVar4.zzf()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzB(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzagh zzaghVar = (zzagh) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzafh zzafhVar = this.zza;
/* 50 */                    int iZzn = zzafhVar.zzn();
/* 54 */                    zzZ(iZzn);
/* 61 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzaghVar.zzg(zzafhVar.zzg());
/* 74 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    OoOil11Ol1o.I00111O();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzafh zzafhVar2 = this.zza;
/* 24 */                    zzaghVar.zzg(zzafhVar2.zzg());
/* 31 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzafh zzafhVar3 = this.zza;
/* 120 */                   int iZzn2 = zzafhVar3.zzn();
/* 124 */                   zzZ(iZzn2);
/* 131 */                   int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Integer.valueOf(zzafhVar3.zzg()));
/* 147 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   OoOil11Ol1o.I00111O();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzafh zzafhVar4 = this.zza;
/* 93 */                    list.add(Integer.valueOf(zzafhVar4.zzg()));
/* 100 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 102 */                       iZzm = zzafhVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzC(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzahb;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzahb zzahbVar = (zzahb) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        OoOil11Ol1o.I00111O();
/* 49 */                        return;
                            }
/* 18 */                    zzafh zzafhVar = this.zza;
/* 20 */                    int iZzn = zzafhVar.zzn();
/* 24 */                    zzaa(iZzn);
/* 31 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzahbVar.zzg(zzafhVar.zzo());
/* 43 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzafh zzafhVar2 = this.zza;
/* 56 */                    zzahbVar.zzg(zzafhVar2.zzo());
/* 63 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       OoOil11Ol1o.I00111O();
/* 116 */                       return;
                            }
/* 81 */                    zzafh zzafhVar3 = this.zza;
/* 83 */                    int iZzn2 = zzafhVar3.zzn();
/* 87 */                    zzaa(iZzn2);
/* 94 */                    int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Long.valueOf(zzafhVar3.zzo()));
/* 110 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzafh zzafhVar4 = this.zza;
/* 127 */                   list.add(Long.valueOf(zzafhVar4.zzo()));
/* 134 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 136 */                       iZzm = zzafhVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzD(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzafy;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzafy zzafyVar = (zzafy) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzafh zzafhVar = this.zza;
/* 50 */                    int iZzn = zzafhVar.zzn();
/* 54 */                    zzZ(iZzn);
/* 61 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzafyVar.zzg(zzafhVar.zzc());
/* 74 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    OoOil11Ol1o.I00111O();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzafh zzafhVar2 = this.zza;
/* 24 */                    zzafyVar.zzg(zzafhVar2.zzc());
/* 31 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzafh zzafhVar3 = this.zza;
/* 120 */                   int iZzn2 = zzafhVar3.zzn();
/* 124 */                   zzZ(iZzn2);
/* 131 */                   int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Float.valueOf(zzafhVar3.zzc()));
/* 147 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   OoOil11Ol1o.I00111O();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzafh zzafhVar4 = this.zza;
/* 93 */                    list.add(Float.valueOf(zzafhVar4.zzc()));
/* 100 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 102 */                       iZzm = zzafhVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }

                @Override
                @Deprecated
                public final void zzE(List list, zzaia zzaiaVar, zzafr zzafrVar) throws zzagq {
                    int iZzm;
/* 1 */             int i = this.zzb;
/* 6 */             if ((i & 7) != 3) {
/* 37 */                OoOil11Ol1o.I00111O();
/* 98 */                return;
                    }
/* 32 */            do {
/* 12 */                list.add(zzT(zzaiaVar, zzafrVar));
/* 15 */                zzafh zzafhVar = this.zza;
/* 21 */                if (zzafhVar.zzC() || this.zzd != 0) {
/* 36 */                    return;
                        } else {
/* 28 */                    iZzm = zzafhVar.zzm();
                        }
/* 32 */            } while (iZzm == i);
/* 34 */            this.zzd = iZzm;
                }

                @Override
                public final void zzF(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzagh zzaghVar = (zzagh) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzaghVar.zzg(zzafhVar.zzh());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzaghVar.zzg(zzafhVar2.zzh());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzafhVar3.zzh()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzafhVar4.zzh()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzG(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzahb;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzahb zzahbVar = (zzahb) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzahbVar.zzg(zzafhVar.zzp());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzahbVar.zzg(zzafhVar2.zzp());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzafhVar3.zzp()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzafhVar4.zzp()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
                
                    r10.put(r4, r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
                
                    r9.zza.zzA(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
                
                    return;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzH(Map map, zzahf zzahfVar, zzafr zzafrVar) throws zzagq {
/* 2 */             zzY(2);
/* 5 */             zzafh zzafhVar = this.zza;
/* 11 */            int iZze = zzafhVar.zze(zzafhVar.zzn());
/* 15 */            Object obj = zzahfVar.zzd;
/* 17 */            Object objZzS = zzahfVar.zzb;
/* 19 */            Object objZzS2 = obj;
                    while (true) {
                        try {
/* 20 */                    int iZzc = zzc();
/* 27 */                    if (iZzc == Integer.MAX_VALUE || zzafhVar.zzC()) {
                                break;
                            }
/* 39 */                    if (iZzc == 1) {
/* 74 */                        objZzS = zzS(zzahfVar.zza, null, null);
                            } else if (iZzc != 2) {
                                try {
/* 47 */                            if (!zzR()) {
/* 55 */                                throw new zzagr("Unable to parse map entry.");
                                    }
                                } catch (zzagq e) {
/* 83 */                            if (!zzR()) {
/* 91 */                                throw new zzagr("Unable to parse map entry.", e);
                                    }
                                }
                            } else {
/* 66 */                        objZzS2 = zzS(zzahfVar.zzc, obj.getClass(), zzafrVar);
                            }
                        } catch (Throwable th) {
/* 103 */                   this.zza.zzA(iZze);
/* 408 */                   throw th;
                        }
                    }
                }

                @Override
                public final void zzI(List list, zzaia zzaiaVar, zzafr zzafrVar) throws zzagq {
                    int iZzm;
/* 1 */             int i = this.zzb;
/* 6 */             if ((i & 7) != 2) {
/* 37 */                OoOil11Ol1o.I00111O();
/* 98 */                return;
                    }
/* 32 */            do {
/* 12 */                list.add(zzU(zzaiaVar, zzafrVar));
/* 15 */                zzafh zzafhVar = this.zza;
/* 21 */                if (zzafhVar.zzC() || this.zzd != 0) {
/* 36 */                    return;
                        } else {
/* 28 */                    iZzm = zzafhVar.zzm();
                        }
/* 32 */            } while (iZzm == i);
/* 34 */            this.zzd = iZzm;
                }

                @Override
                public final void zzJ(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzagh zzaghVar = (zzagh) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 == 2) {
/* 48 */                    zzafh zzafhVar = this.zza;
/* 50 */                    int iZzn = zzafhVar.zzn();
/* 54 */                    zzZ(iZzn);
/* 61 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 74 */                    do {
/* 67 */                        zzaghVar.zzg(zzafhVar.zzk());
/* 74 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 16 */                if (i2 != 5) {
/* 44 */                    OoOil11Ol1o.I00111O();
/* 47 */                    return;
                        }
/* 41 */                do {
/* 18 */                    zzafh zzafhVar2 = this.zza;
/* 24 */                    zzaghVar.zzg(zzafhVar2.zzk());
/* 31 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 35 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 41 */                } while (iZzm2 == this.zzb);
                    } else {
/* 77 */                int i3 = i & 7;
/* 79 */                if (i3 == 2) {
/* 118 */                   zzafh zzafhVar3 = this.zza;
/* 120 */                   int iZzn2 = zzafhVar3.zzn();
/* 124 */                   zzZ(iZzn2);
/* 131 */                   int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 147 */                   do {
/* 140 */                       list.add(Integer.valueOf(zzafhVar3.zzk()));
/* 147 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 81 */                if (i3 != 5) {
/* 114 */                   OoOil11Ol1o.I00111O();
/* 117 */                   return;
                        }
/* 108 */               do {
/* 83 */                    zzafh zzafhVar4 = this.zza;
/* 93 */                    list.add(Integer.valueOf(zzafhVar4.zzk()));
/* 100 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 102 */                       iZzm = zzafhVar4.zzm();
                            }
/* 108 */               } while (iZzm == this.zzb);
/* 110 */               iZzm2 = iZzm;
                    }
/* 111 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzK(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzahb;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzahb zzahbVar = (zzahb) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        OoOil11Ol1o.I00111O();
/* 49 */                        return;
                            }
/* 18 */                    zzafh zzafhVar = this.zza;
/* 20 */                    int iZzn = zzafhVar.zzn();
/* 24 */                    zzaa(iZzn);
/* 31 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzahbVar.zzg(zzafhVar.zzt());
/* 43 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzafh zzafhVar2 = this.zza;
/* 56 */                    zzahbVar.zzg(zzafhVar2.zzt());
/* 63 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       OoOil11Ol1o.I00111O();
/* 116 */                       return;
                            }
/* 81 */                    zzafh zzafhVar3 = this.zza;
/* 83 */                    int iZzn2 = zzafhVar3.zzn();
/* 87 */                    zzaa(iZzn2);
/* 94 */                    int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Long.valueOf(zzafhVar3.zzt()));
/* 110 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzafh zzafhVar4 = this.zza;
/* 127 */                   list.add(Long.valueOf(zzafhVar4.zzt()));
/* 134 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 136 */                       iZzm = zzafhVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzL(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzagh zzaghVar = (zzagh) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzaghVar.zzg(zzafhVar.zzl());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzaghVar.zzg(zzafhVar2.zzl());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzafhVar3.zzl()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzafhVar4.zzl()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzM(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzahb;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzahb zzahbVar = (zzahb) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzahbVar.zzg(zzafhVar.zzu());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzahbVar.zzg(zzafhVar2.zzu());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzafhVar3.zzu()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzafhVar4.zzu()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                public final void zzN(List list, boolean z) throws zzagq {
                    int iZzm;
                    int iZzm2;
/* 6 */             if ((this.zzb & 7) != 2) {
/* 75 */                OoOil11Ol1o.I00111O();
/* 106 */               return;
                    }
/* 10 */            if ((list instanceof zzagy) && !z) {
/* 15 */                zzagy zzagyVar = (zzagy) list;
/* 37 */                do {
/* 17 */                    zzp();
/* 20 */                    zzagyVar.zza();
/* 23 */                    zzafh zzafhVar = this.zza;
/* 29 */                    if (zzafhVar.zzC()) {
/* 62 */                        return;
                            } else {
/* 31 */                        iZzm2 = zzafhVar.zzm();
                            }
/* 37 */                } while (iZzm2 == this.zzb);
                    } else {
/* 69 */                do {
/* 51 */                    list.add(z ? zzu() : zzt());
/* 54 */                    zzafh zzafhVar2 = this.zza;
/* 60 */                    if (zzafhVar2.zzC()) {
/* 62 */                        return;
                            } else {
/* 63 */                        iZzm = zzafhVar2.zzm();
                            }
/* 69 */                } while (iZzm == this.zzb);
/* 71 */                iZzm2 = iZzm;
                    }
/* 72 */            this.zzd = iZzm2;
                }

                @Override
                public final void zzO(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzagh;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzagh zzaghVar = (zzagh) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzaghVar.zzg(zzafhVar.zzn());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzaghVar.zzg(zzafhVar2.zzn());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Integer.valueOf(zzafhVar3.zzn()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Integer.valueOf(zzafhVar4.zzn()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzP(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzahb;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzahb zzahbVar = (zzahb) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzahbVar.zzg(zzafhVar.zzv());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzahbVar.zzg(zzafhVar2.zzv());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Long.valueOf(zzafhVar3.zzv()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Long.valueOf(zzafhVar4.zzv()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final boolean zzQ() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzD();
                }

                @Override
                public final boolean zzR() {
                    int i;
/* 1 */             zzafh zzafhVar = this.zza;
/* 7 */             if (zzafhVar.zzC() || (i = this.zzb) == this.zzc) {
/* 21 */                return false;
                    }
/* 16 */            return zzafhVar.zzE(i);
                }

                @Override
                public final double zza() throws zzagq {
/* 2 */             zzY(1);
/* 7 */             return this.zza.zzb();
                }

                @Override
                public final float zzb() throws zzagq {
/* 2 */             zzY(5);
/* 7 */             return this.zza.zzc();
                }

                @Override
                public final int zzc() {
/* 1 */             int iZzm = this.zzd;
/* 3 */             if (iZzm != 0) {
/* 5 */                 this.zzb = iZzm;
/* 8 */                 this.zzd = 0;
                    } else {
/* 13 */                iZzm = this.zza.zzm();
/* 17 */                this.zzb = iZzm;
                    }
/* 19 */            if (iZzm == 0 || iZzm == this.zzc) {
/* 29 */                return Integer.MAX_VALUE;
                    }
/* 26 */            return iZzm >>> 3;
                }

                @Override
                public final int zzd() {
/* 1 */             return this.zzb;
                }

                @Override
                public final int zze() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzf();
                }

                @Override
                public final int zzf() throws zzagq {
/* 2 */             zzY(5);
/* 7 */             return this.zza.zzg();
                }

                @Override
                public final int zzg() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzh();
                }

                @Override
                public final int zzh() throws zzagq {
/* 2 */             zzY(5);
/* 7 */             return this.zza.zzk();
                }

                @Override
                public final int zzi() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzl();
                }

                @Override
                public final int zzj() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzn();
                }

                @Override
                public final long zzk() throws zzagq {
/* 2 */             zzY(1);
/* 7 */             return this.zza.zzo();
                }

                @Override
                public final long zzl() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzp();
                }

                @Override
                public final long zzm() throws zzagq {
/* 2 */             zzY(1);
/* 7 */             return this.zza.zzt();
                }

                @Override
                public final long zzn() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzu();
                }

                @Override
                public final long zzo() throws zzagq {
/* 2 */             zzY(0);
/* 7 */             return this.zza.zzv();
                }

                @Override
                public final zzafd zzp() throws zzagq {
/* 2 */             zzY(2);
/* 7 */             return this.zza.zzw();
                }

                @Override
                @Deprecated
                public final Object zzr(Class cls, zzafr zzafrVar) throws zzagq {
/* 2 */             zzY(3);
/* 13 */            return zzT(zzahw.zza().zzb(cls), zzafrVar);
                }

                @Override
                public final Object zzs(Class cls, zzafr zzafrVar) throws zzagq {
/* 2 */             zzY(2);
/* 13 */            return zzU(zzahw.zza().zzb(cls), zzafrVar);
                }

                @Override
                public final String zzt() throws zzagq {
/* 2 */             zzY(2);
/* 7 */             return this.zza.zzx();
                }

                @Override
                public final String zzu() throws zzagq {
/* 2 */             zzY(2);
/* 7 */             return this.zza.zzy();
                }

                @Override
                public final void zzv(Object obj, zzaia zzaiaVar, zzafr zzafrVar) throws zzagq {
/* 2 */             zzY(3);
/* 5 */             zzV(obj, zzaiaVar, zzafrVar);
                }

                @Override
                public final void zzw(Object obj, zzaia zzaiaVar, zzafr zzafrVar) throws zzagr {
/* 2 */             zzY(2);
/* 5 */             zzW(obj, zzaiaVar, zzafrVar);
                }

                @Override
                public final void zzx(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzaet;
/* 3 */             int i = this.zzb;
/* 6 */             if (z) {
/* 9 */                 zzaet zzaetVar = (zzaet) list;
/* 11 */                int i2 = i & 7;
/* 13 */                if (i2 != 0) {
/* 15 */                    if (i2 != 2) {
/* 45 */                        OoOil11Ol1o.I00111O();
/* 48 */                        return;
                            }
/* 17 */                    zzafh zzafhVar = this.zza;
/* 27 */                    int iZzd = zzafhVar.zzd() + zzafhVar.zzn();
/* 39 */                    do {
/* 32 */                        zzaetVar.zze(zzafhVar.zzD());
/* 39 */                    } while (zzafhVar.zzd() < iZzd);
/* 41 */                    zzX(iZzd);
/* 44 */                    return;
                        }
/* 71 */                do {
/* 49 */                    zzafh zzafhVar2 = this.zza;
/* 55 */                    zzaetVar.zze(zzafhVar2.zzD());
/* 62 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 65 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 71 */                } while (iZzm2 == this.zzb);
                    } else {
/* 74 */                int i3 = i & 7;
/* 76 */                if (i3 != 0) {
/* 78 */                    if (i3 != 2) {
/* 112 */                       OoOil11Ol1o.I00111O();
/* 115 */                       return;
                            }
/* 80 */                    zzafh zzafhVar3 = this.zza;
/* 90 */                    int iZzd2 = zzafhVar3.zzd() + zzafhVar3.zzn();
/* 106 */                   do {
/* 99 */                        list.add(Boolean.valueOf(zzafhVar3.zzD()));
/* 106 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 108 */                   zzX(iZzd2);
/* 111 */                   return;
                        }
/* 141 */               do {
/* 116 */                   zzafh zzafhVar4 = this.zza;
/* 126 */                   list.add(Boolean.valueOf(zzafhVar4.zzD()));
/* 133 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 135 */                       iZzm = zzafhVar4.zzm();
                            }
/* 141 */               } while (iZzm == this.zzb);
/* 143 */               iZzm2 = iZzm;
                    }
/* 144 */           this.zzd = iZzm2;
                }

                @Override
                public final void zzy(List list) throws zzagq {
                    int iZzm;
/* 6 */             if ((this.zzb & 7) != 2) {
/* 35 */                OoOil11Ol1o.I00111O();
/* 77 */                return;
                    }
/* 30 */            do {
/* 12 */                list.add(zzp());
/* 15 */                zzafh zzafhVar = this.zza;
/* 21 */                if (zzafhVar.zzC()) {
/* 23 */                    return;
                        } else {
/* 24 */                    iZzm = zzafhVar.zzm();
                        }
/* 30 */            } while (iZzm == this.zzb);
/* 32 */            this.zzd = iZzm;
                }

                @Override
                public final void zzz(List list) throws zzagr {
                    int iZzm;
                    int iZzm2;
/* 1 */             boolean z = list instanceof zzafo;
/* 3 */             int i = this.zzb;
/* 7 */             if (z) {
/* 10 */                zzafo zzafoVar = (zzafo) list;
/* 12 */                int i2 = i & 7;
/* 14 */                if (i2 != 1) {
/* 16 */                    if (i2 != 2) {
/* 46 */                        OoOil11Ol1o.I00111O();
/* 49 */                        return;
                            }
/* 18 */                    zzafh zzafhVar = this.zza;
/* 20 */                    int iZzn = zzafhVar.zzn();
/* 24 */                    zzaa(iZzn);
/* 31 */                    int iZzd = zzafhVar.zzd() + iZzn;
/* 43 */                    do {
/* 36 */                        zzafoVar.zzf(zzafhVar.zzb());
/* 43 */                    } while (zzafhVar.zzd() < iZzd);
/* 168 */                   return;
                        }
/* 72 */                do {
/* 50 */                    zzafh zzafhVar2 = this.zza;
/* 56 */                    zzafoVar.zzf(zzafhVar2.zzb());
/* 63 */                    if (zzafhVar2.zzC()) {
/* 168 */                       return;
                            } else {
/* 66 */                        iZzm2 = zzafhVar2.zzm();
                            }
/* 72 */                } while (iZzm2 == this.zzb);
                    } else {
/* 75 */                int i3 = i & 7;
/* 77 */                if (i3 != 1) {
/* 79 */                    if (i3 != 2) {
/* 113 */                       OoOil11Ol1o.I00111O();
/* 116 */                       return;
                            }
/* 81 */                    zzafh zzafhVar3 = this.zza;
/* 83 */                    int iZzn2 = zzafhVar3.zzn();
/* 87 */                    zzaa(iZzn2);
/* 94 */                    int iZzd2 = zzafhVar3.zzd() + iZzn2;
/* 110 */                   do {
/* 103 */                       list.add(Double.valueOf(zzafhVar3.zzb()));
/* 110 */                   } while (zzafhVar3.zzd() < iZzd2);
/* 168 */                   return;
                        }
/* 142 */               do {
/* 117 */                   zzafh zzafhVar4 = this.zza;
/* 127 */                   list.add(Double.valueOf(zzafhVar4.zzb()));
/* 134 */                   if (zzafhVar4.zzC()) {
/* 168 */                       return;
                            } else {
/* 136 */                       iZzm = zzafhVar4.zzm();
                            }
/* 142 */               } while (iZzm == this.zzb);
/* 144 */               iZzm2 = iZzm;
                    }
/* 145 */           this.zzd = iZzm2;
                }
            }
