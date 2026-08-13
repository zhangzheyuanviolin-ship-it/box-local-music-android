            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.Inet4Address;
            import java.net.InetSocketAddress;
            import java.net.SocketAddress;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.I000II;
            
            final class zzbkb {
                private List zza;
                private int zzb = 0;
                private final boolean zzc;

                public zzbkb(List list, boolean z) {
/* 7 */             this.zzc = z;
/* 9 */             zzf(list);
                }

                private static final List zzj(List list, List list2) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return list2;
                    }
/* 12 */            if (list2.isEmpty()) {
/* 14 */                return list;
                    }
/* 26 */            ArrayList arrayList = new ArrayList(list2.size() + list.size());
/* 42 */            for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
/* 48 */                if (i < list.size()) {
/* 56 */                    arrayList.add((zzbka) list.get(i));
                        }
/* 63 */                if (i < list2.size()) {
/* 71 */                    arrayList.add((zzbka) list2.get(i));
                        }
                    }
/* 106 */           return arrayList;
                }

                public final int zza() {
/* 3 */             return this.zza.size();
                }

                public final zzatu zzb() {
/* 5 */             if (zzh()) {
/* 1 */                 return ((zzbka) this.zza.get(this.zzb)).zza;
                    }
/* 24 */            I000II.I001IO000("Index is off the end of the address group list");
/* 27 */            return null;
                }

                public final SocketAddress zzc() {
/* 5 */             if (zzh()) {
/* 1 */                 return ((zzbka) this.zza.get(this.zzb)).zzb;
                    }
/* 24 */            I000II.I001IO000("Index is past the end of the address group list");
/* 27 */            return null;
                }

                public final List zzd() {
/* 5 */             if (zzh()) {
/* 21 */                return Collections.singletonList(zzbka.zzb((zzbka) this.zza.get(this.zzb)));
                    }
/* 28 */            I000II.I001IO000("Index is past the end of the address group list");
/* 31 */            return null;
                }

                public final void zze() {
/* 2 */             this.zzb = 0;
                }

                public final void zzf(List list) {
                    List listZzj;
/* 3 */             zzgo.zzc(list, "newGroups");
/* 9 */             if (this.zzc) {
/* 13 */                ArrayList arrayList = new ArrayList();
/* 18 */                ArrayList arrayList2 = new ArrayList();
/* 21 */                Boolean bool = null;
/* 27 */                for (int i = 0; i < list.size(); i++) {
/* 33 */                    zzavj zzavjVar = (zzavj) list.get(i);
/* 44 */                    for (int i2 = 0; i2 < zzavjVar.zzb().size(); i2++) {
/* 54 */                        SocketAddress socketAddress = (SocketAddress) zzavjVar.zzb().get(i2);
/* 58 */                        if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
/* 71 */                            if (bool == null) {
/* 73 */                                bool = Boolean.FALSE;
                                    }
/* 84 */                            arrayList.add(new zzbka(zzavjVar.zza(), socketAddress));
                                } else {
/* 88 */                            if (bool == null) {
/* 90 */                                bool = Boolean.TRUE;
                                    }
/* 101 */                           arrayList2.add(new zzbka(zzavjVar.zza(), socketAddress));
                                }
                            }
                        }
/* 123 */               listZzj = (bool == null || !bool.booleanValue()) ? zzj(arrayList, arrayList2) : zzj(arrayList2, arrayList);
                    } else {
/* 130 */               ArrayList arrayList3 = new ArrayList();
/* 138 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 144 */                   zzavj zzavjVar2 = (zzavj) list.get(i3);
/* 155 */                   for (int i4 = 0; i4 < zzavjVar2.zzb().size(); i4++) {
/* 176 */                       arrayList3.add(new zzbka(zzavjVar2.zza(), (SocketAddress) zzavjVar2.zzb().get(i4)));
                            }
                        }
/* 185 */               listZzj = arrayList3;
                    }
/* 186 */           this.zza = listZzj;
/* 188 */           this.zzb = 0;
                }

                public final boolean zzg() {
/* 5 */             if (!zzh()) {
/* 7 */                 return false;
                    }
                    this.zzb++;
/* 15 */            return zzh();
                }

                public final boolean zzh() {
                    return this.zzb < this.zza.size();
                }

                public final boolean zzi(SocketAddress socketAddress) {
/* 3 */             zzgo.zzc(socketAddress, "needle");
/* 14 */            for (int i = 0; i < this.zza.size(); i++) {
/* 32 */                if (((zzbka) this.zza.get(i)).zzb.equals(socketAddress)) {
/* 34 */                    this.zzb = i;
/* 36 */                    return true;
                        }
                    }
/* 6 */             return false;
                }
            }
