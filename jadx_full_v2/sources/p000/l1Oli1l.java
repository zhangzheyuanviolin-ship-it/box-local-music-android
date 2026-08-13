            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            public final class l1Oli1l extends iiI1l0 implements iolll0ill1i {
                public lilOOl0 I000II;
                public Boolean I000O01llI0;
                public String I000OOo1O;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) throws PackageManager.NameNotFoundException {
                    List list;
/* 1 */             lilOOl0 lilool0 = this.I000II;
/* 5 */             ArrayList arrayList = null;
/* 5 */             ioo1oIl0i10O ioo00lo1li1 = null;
/* 5 */             iooliIoiiOlo iooo0li0io = null;
                    switch (i) {
                        case 1:
/* 974 */                   ii0oooi0IO0l ii0oooi0io0l = (ii0oooi0IO0l) iiIIoi1oIO1.I00000oIO(parcel, ii0oooi0IO0l.CREATOR);
/* 982 */                   lli10iI lli10ii = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 984 */                   iiIIoi1oIO1.I0000O(parcel);
/* 987 */                   I000OOo1O(ii0oooi0io0l, lli10ii);
/* 990 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 2:
/* 947 */                   lio0llOI0 lio0lloi0 = (lio0llOI0) iiIIoi1oIO1.I00000oIO(parcel, lio0llOI0.CREATOR);
/* 955 */                   lli10iI lli10ii2 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 957 */                   iiIIoi1oIO1.I0000O(parcel);
/* 960 */                   I00II0Ol1O0l(lio0lloi0, lli10ii2);
/* 963 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 3:
                        case 8:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_ANKLE:
                        default:
/* 6 */                     return false;
                        case 4:
/* 928 */                   lli10iI lli10ii3 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 930 */                   iiIIoi1oIO1.I0000O(parcel);
/* 933 */                   I00100o1O0lo(lli10ii3);
/* 936 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 5:
/* 877 */                   ii0oooi0IO0l ii0oooi0io0l2 = (ii0oooi0IO0l) iiIIoi1oIO1.I00000oIO(parcel, ii0oooi0IO0l.CREATOR);
/* 879 */                   String string = parcel.readString();
/* 883 */                   parcel.readString();
/* 886 */                   iiIIoi1oIO1.I0000O(parcel);
/* 889 */                   lII0I0I000I.I000II(ii0oooi0io0l2);
/* 892 */                   lII0I0I000I.I0000O(string);
/* 895 */                   I00IoIO0lI(string, true);
/* 902 */                   O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(13);
/* 905 */                   o10oO1IiI1.I00iiI = ii0oooi0io0l2;
/* 907 */                   o10oO1IiI1.I00iiO = string;
/* 909 */                   o10oO1IiI1.I00iio = this;
/* 911 */                   VarHandle.storeStoreFence();
/* 914 */                   I00IoO0(o10oO1IiI1);
/* 917 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 6:
/* 858 */                   lli10iI lli10ii4 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 860 */                   iiIIoi1oIO1.I0000O(parcel);
/* 863 */                   I001i1O0Ol(lli10ii4);
/* 866 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 7:
/* 731 */                   lli10iI lli10ii5 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 741 */                   Object[] objArr = parcel.readInt() != 0;
/* 742 */                   iiIIoi1oIO1.I0000O(parcel);
/* 745 */                   I0000oI00(lli10ii5);
/* 748 */                   String str = lli10ii5.I00iOIl;
/* 750 */                   lII0I0I000I.I000II(str);
/* 753 */                   l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 759 */                   l0ooiII1Ol l0ooiii1ol = new l0ooiII1Ol(z ? 1 : 0);
/* 762 */                   l0ooiii1ol.I0000Il00O = str;
/* 764 */                   l0ooiii1ol.I00000oOI = this;
/* 766 */                   VarHandle.storeStoreFence();
                            try {
/* 777 */                       List<lioOO0ioOI> list2 = (List) l0o10ooo0I00iOIl.I010l1ol111(l0ooiii1ol).get();
/* 785 */                       ArrayList arrayList2 = new ArrayList(list2.size());
/* 796 */                       for (lioOO0ioOI liooo0iooi : list2) {
/* 804 */                           if (objArr != false || !lioil0ilIOi.I01I1Oo0oll(liooo0iooi.I0000Il00O)) {
/* 823 */                               arrayList2.add(new lio0llOI0(liooo0iooi));
                                    }
                                }
/* 827 */                       arrayList = arrayList2;
                            } catch (InterruptedException | ExecutionException e) {
/* 841 */                       lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to get user properties. appId", e);
                            }
/* 844 */                   parcel2.writeNoException();
/* 847 */                   parcel2.writeTypedList(arrayList);
/* 7 */                     return true;
                        case 9:
/* 704 */                   ii0oooi0IO0l ii0oooi0io0l3 = (ii0oooi0IO0l) iiIIoi1oIO1.I00000oIO(parcel, ii0oooi0IO0l.CREATOR);
/* 706 */                   String string2 = parcel.readString();
/* 710 */                   iiIIoi1oIO1.I0000O(parcel);
/* 713 */                   byte[] bArrI00IO1oi11O = I00IO1oi11O(string2, ii0oooi0io0l3);
/* 717 */                   parcel2.writeNoException();
/* 720 */                   parcel2.writeByteArray(bArrI00IO1oi11O);
/* 7 */                     return true;
                        case 10:
/* 670 */                   long j = parcel.readLong();
/* 674 */                   String string3 = parcel.readString();
/* 678 */                   String string4 = parcel.readString();
/* 682 */                   String string5 = parcel.readString();
/* 686 */                   iiIIoi1oIO1.I0000O(parcel);
/* 690 */                   I000o00OoI0I(j, string3, string4, string5);
/* 693 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 11:
/* 654 */                   lli10iI lli10ii6 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 656 */                   iiIIoi1oIO1.I0000O(parcel);
/* 659 */                   String strI000OiO = I000OiO(lli10ii6);
/* 663 */                   parcel2.writeNoException();
/* 666 */                   parcel2.writeString(strI000OiO);
/* 7 */                     return true;
                        case 12:
/* 628 */                   iII000ol000 iii000ol000 = (iII000ol000) iiIIoi1oIO1.I00000oIO(parcel, iII000ol000.CREATOR);
/* 636 */                   lli10iI lli10ii7 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 638 */                   iiIIoi1oIO1.I0000O(parcel);
/* 641 */                   I001iOo1i0O(iii000ol000, lli10ii7);
/* 644 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 13:
/* 573 */                   iII000ol000 iii000ol0002 = (iII000ol000) iiIIoi1oIO1.I00000oIO(parcel, iII000ol000.CREATOR);
/* 575 */                   iiIIoi1oIO1.I0000O(parcel);
/* 578 */                   lII0I0I000I.I000II(iii000ol0002);
/* 583 */                   lII0I0I000I.I000II(iii000ol0002.I00iiO);
/* 588 */                   lII0I0I000I.I0000O(iii000ol0002.I00iOIl);
/* 593 */                   I00IoIO0lI(iii000ol0002.I00iOIl, true);
/* 598 */                   iII000ol000 iii000ol0003 = new iII000ol000(iii000ol0002);
/* 605 */                   IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(8);
/* 608 */                   illoOi1I1OO.I00iiI = iii000ol0003;
/* 610 */                   illoOi1I1OO.I00iiO = this;
/* 612 */                   VarHandle.storeStoreFence();
/* 615 */                   I00IoO0(illoOi1I1OO);
/* 618 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 14:
/* 528 */                   String string6 = parcel.readString();
/* 532 */                   String string7 = parcel.readString();
/* 536 */                   ClassLoader classLoader = iiIIoi1oIO1.I00000oIO;
/* 542 */                   z = parcel.readInt() != 0;
/* 551 */                   lli10iI lli10ii8 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 553 */                   iiIIoi1oIO1.I0000O(parcel);
/* 556 */                   List listI00Io1o110i = I00Io1o110i(string6, string7, z, lli10ii8);
/* 560 */                   parcel2.writeNoException();
/* 563 */                   parcel2.writeTypedList(listI00Io1o110i);
/* 7 */                     return true;
                        case 15:
/* 493 */                   String string8 = parcel.readString();
/* 497 */                   String string9 = parcel.readString();
/* 501 */                   String string10 = parcel.readString();
/* 505 */                   ClassLoader classLoader2 = iiIIoi1oIO1.I00000oIO;
/* 511 */                   boolean z = parcel.readInt() != 0;
/* 514 */                   iiIIoi1oIO1.I0000O(parcel);
/* 517 */                   List listI0001Ioi1lo = I0001Ioi1lo(string8, string9, string10, z);
/* 521 */                   parcel2.writeNoException();
/* 524 */                   parcel2.writeTypedList(listI0001Ioi1lo);
/* 7 */                     return true;
                        case 16:
/* 463 */                   String string11 = parcel.readString();
/* 467 */                   String string12 = parcel.readString();
/* 477 */                   lli10iI lli10ii9 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 479 */                   iiIIoi1oIO1.I0000O(parcel);
/* 482 */                   List listI000iOII = I000iOII(string11, string12, lli10ii9);
/* 486 */                   parcel2.writeNoException();
/* 489 */                   parcel2.writeTypedList(listI000iOII);
/* 7 */                     return true;
                        case 17:
/* 437 */                   String string13 = parcel.readString();
/* 441 */                   String string14 = parcel.readString();
/* 445 */                   String string15 = parcel.readString();
/* 449 */                   iiIIoi1oIO1.I0000O(parcel);
/* 452 */                   List listI00100l0 = I00100l0(string13, string14, string15);
/* 456 */                   parcel2.writeNoException();
/* 459 */                   parcel2.writeTypedList(listI00100l0);
/* 7 */                     return true;
                        case PoseLandmark.RIGHT_PINKY:
/* 425 */                   lli10iI lli10ii10 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 427 */                   iiIIoi1oIO1.I0000O(parcel);
/* 430 */                   I00IOO(lli10ii10);
/* 433 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.LEFT_INDEX:
/* 399 */                   Bundle bundle = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 407 */                   lli10iI lli10ii11 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 409 */                   iiIIoi1oIO1.I0000O(parcel);
/* 412 */                   I00Io1lO(bundle, lli10ii11);
/* 415 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.RIGHT_INDEX:
/* 381 */                   lli10iI lli10ii12 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 383 */                   iiIIoi1oIO1.I0000O(parcel);
/* 386 */                   I000l1(lli10ii12);
/* 389 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.LEFT_THUMB:
/* 350 */                   lli10iI lli10ii13 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 352 */                   iiIIoi1oIO1.I0000O(parcel);
/* 355 */                   iO0Ol0ol io0ol0olI000oI1ioi = I000oI1ioi(lli10ii13);
/* 359 */                   parcel2.writeNoException();
/* 362 */                   if (io0ol0olI000oI1ioi == null) {
/* 364 */                       parcel2.writeInt(0);
/* 7 */                         return true;
                            }
/* 368 */                   parcel2.writeInt(1);
/* 371 */                   io0ol0olI000oI1ioi.writeToParcel(parcel2, 1);
/* 7 */                     return true;
                        case PoseLandmark.RIGHT_HIP:
/* 204 */                   lli10iI lli10ii14 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 212 */                   Bundle bundle2 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 214 */                   iiIIoi1oIO1.I0000O(parcel);
/* 217 */                   I0000oI00(lli10ii14);
/* 220 */                   String str2 = lli10ii14.I00iOIl;
/* 222 */                   lII0I0I000I.I000II(str2);
/* 237 */                   if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010OIo1l)) {
/* 239 */                       l0o10OoO0 l0o10ooo0I00iOIl2 = lilool0.I00iOIl();
/* 245 */                       l1IiIo0lO0li l1iiio0lo0li = new l1IiIo0lO0li(0);
/* 248 */                       l1iiio0lo0li.I00000oOI = lli10ii14;
/* 250 */                       l1iiio0lo0li.I0000Il00O = bundle2;
/* 252 */                       l1iiio0lo0li.I0000O = this;
/* 254 */                       VarHandle.storeStoreFence();
                                try {
/* 269 */                           list = (List) l0o10ooo0I00iOIl2.I010lI0oi(l1iiio0lo0li).get(10000L, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
/* 284 */                           lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Failed to get trigger URIs. appId", e2);
/* 287 */                           list = Collections.EMPTY_LIST;
                                }
                            } else {
/* 290 */                       l0o10OoO0 l0o10ooo0I00iOIl3 = lilool0.I00iOIl();
/* 296 */                       l1IiIo0lO0li l1iiio0lo0li2 = new l1IiIo0lO0li(1);
/* 299 */                       l1iiio0lo0li2.I00000oOI = lli10ii14;
/* 301 */                       l1iiio0lo0li2.I0000Il00O = bundle2;
/* 303 */                       l1iiio0lo0li2.I0000O = this;
/* 305 */                       VarHandle.storeStoreFence();
                                try {
/* 316 */                           list = (List) l0o10ooo0I00iOIl3.I010l1ol111(l1iiio0lo0li2).get();
                                } catch (InterruptedException | ExecutionException e3) {
/* 331 */                           lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Failed to get trigger URIs. appId", e3);
/* 334 */                           list = Collections.EMPTY_LIST;
                                }
                            }
/* 336 */                   parcel2.writeNoException();
/* 339 */                   parcel2.writeTypedList(list);
/* 7 */                     return true;
                        case PoseLandmark.LEFT_KNEE:
/* 186 */                   lli10iI lli10ii15 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 188 */                   iiIIoi1oIO1.I0000O(parcel);
/* 191 */                   I0010o(lli10ii15);
/* 194 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.RIGHT_KNEE:
/* 168 */                   lli10iI lli10ii16 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 170 */                   iiIIoi1oIO1.I0000O(parcel);
/* 173 */                   I001IO000(lli10ii16);
/* 176 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 27:
/* 150 */                   lli10iI lli10ii17 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 152 */                   iiIIoi1oIO1.I0000O(parcel);
/* 155 */                   I00IlilI0i0i(lli10ii17);
/* 158 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.LEFT_HEEL:
/* 97 */                    lli10iI lli10ii18 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 105 */                   liIlli liilli = (liIlli) iiIIoi1oIO1.I00000oIO(parcel, liIlli.CREATOR);
/* 107 */                   IBinder strongBinder = parcel.readStrongBinder();
/* 111 */                   if (strongBinder != null) {
/* 116 */                       IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
/* 130 */                       iooo0li0io = iInterfaceQueryLocalInterface instanceof iooliIoiiOlo ? (iooliIoiiOlo) iInterfaceQueryLocalInterface : new iooO0lI0io(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 11);
                            }
/* 134 */                   iiIIoi1oIO1.I0000O(parcel);
/* 137 */                   I00111O(lli10ii18, liilli, iooo0li0io);
/* 140 */                   parcel2.writeNoException();
/* 7 */                     return true;
                        case 30:
/* 71 */                    lli10iI lli10ii19 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 79 */                    iI0iiII1i ii0iiii1i = (iI0iiII1i) iiIIoi1oIO1.I00000oIO(parcel, iI0iiII1i.CREATOR);
/* 81 */                    iiIIoi1oIO1.I0000O(parcel);
/* 84 */                    I00IioO0OiOi(lli10ii19, ii0iiii1i);
/* 87 */                    parcel2.writeNoException();
/* 7 */                     return true;
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 18 */                    lli10iI lli10ii20 = (lli10iI) iiIIoi1oIO1.I00000oIO(parcel, lli10iI.CREATOR);
/* 26 */                    Bundle bundle3 = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 28 */                    IBinder strongBinder2 = parcel.readStrongBinder();
/* 32 */                    if (strongBinder2 != null) {
/* 37 */                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
/* 51 */                        ioo00lo1li1 = iInterfaceQueryLocalInterface2 instanceof ioo1oIl0i10O ? (ioo1oIl0i10O) iInterfaceQueryLocalInterface2 : new ioo00lo1lI1(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 11);
                            }
/* 55 */                    iiIIoi1oIO1.I0000O(parcel);
/* 58 */                    I0000Il00O(lli10ii20, bundle3, ioo00lo1li1);
/* 61 */                    parcel2.writeNoException();
/* 7 */                     return true;
                    }
                }

                @Override
                public final void I0000Il00O(lli10iI lli10ii, Bundle bundle, ioo1oIl0i10O ioo1oil0i10o) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I000II(str);
/* 11 */            l0o10OoO0 l0o10ooo0I00iOIl = this.I000II.I00iOIl();
/* 18 */            iOlO1o iolo1o = new iOlO1o(1);
/* 21 */            iolo1o.I00iiO = this;
/* 23 */            iolo1o.I00iio = lli10ii;
/* 25 */            iolo1o.I00ilI0I1 = bundle;
/* 27 */            iolo1o.I00ilO0 = ioo1oil0i10o;
/* 29 */            iolo1o.I00iiI = str;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            l0o10ooo0I00iOIl.I010o0o0oO(iolo1o);
                }

                public final void I0000O(Runnable runnable) {
/* 1 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            if (lilool0.I00iOIl().I010l1O()) {
/* 13 */                runnable.run();
                    } else {
/* 21 */                lilool0.I00iOIl().I01101IOlO(runnable);
                    }
                }

                public final void I0000oI00(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             lII0I0I000I.I000II(lli10ii);
/* 4 */             String str = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 10 */            I00IoIO0lI(str, false);
/* 21 */            this.I000II.I00iIO().I010l1O(lli10ii.I00iiI);
                }

                @Override
                public final List I0001Ioi1lo(String str, String str2, String str3, boolean z) throws PackageManager.NameNotFoundException {
/* 2 */             I00IoIO0lI(str, true);
/* 5 */             lilOOl0 lilool0 = this.I000II;
/* 7 */             l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 13 */            l10loil00OOO l10loil00ooo = new l10loil00OOO(1);
/* 16 */            l10loil00ooo.I00000oOI = str;
/* 18 */            l10loil00ooo.I0000Il00O = str2;
/* 20 */            l10loil00ooo.I0000O = str3;
/* 22 */            l10loil00ooo.I0000oI00 = this;
/* 24 */            VarHandle.storeStoreFence();
                    try {
/* 35 */                List<lioOO0ioOI> list = (List) l0o10ooo0I00iOIl.I010l1ol111(l10loil00ooo).get();
/* 43 */                ArrayList arrayList = new ArrayList(list.size());
/* 54 */                for (lioOO0ioOI liooo0iooi : list) {
/* 62 */                    if (z || !lioil0ilIOi.I01I1Oo0oll(liooo0iooi.I0000Il00O)) {
/* 80 */                        arrayList.add(new lio0llOI0(liooo0iooi));
                            }
                        }
/* 84 */                return arrayList;
                    } catch (InterruptedException | ExecutionException e) {
/* 97 */                lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to get user properties as. appId", e);
/* 100 */               return Collections.EMPTY_LIST;
                    }
                }

                @Override
                public final void I000OOo1O(ii0oooi0IO0l ii0oooi0io0l, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             lII0I0I000I.I000II(ii0oooi0io0l);
/* 4 */             I0000oI00(lli10ii);
/* 11 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(12);
/* 14 */            o10oO1IiI1.I00iiI = ii0oooi0io0l;
/* 16 */            o10oO1IiI1.I00iiO = lli10ii;
/* 18 */            o10oO1IiI1.I00iio = this;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I00IoO0(o10oO1IiI1);
                }

                @Override
                public final String I000OiO(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             lilOOl0 lilool0 = this.I000II;
/* 6 */             l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 13 */            l0ooiII1Ol l0ooiii1ol = new l0ooiII1Ol(2);
/* 16 */            l0ooiii1ol.I0000Il00O = lli10ii;
/* 18 */            l0ooiii1ol.I00000oOI = lilool0;
/* 20 */            VarHandle.storeStoreFence();
                    try {
/* 35 */                return (String) l0o10ooo0I00iOIl.I010l1ol111(l0ooiii1ol).get(30000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 53 */                lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(lli10ii.I00iOIl), "Failed to get app instance id. appId", e);
/* 56 */                return null;
                    }
                }

                @Override
                public final List I000iOII(String str, String str2, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str3 = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I000II(str3);
/* 9 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 18 */            l10loil00OOO l10loil00ooo = new l10loil00OOO(2);
/* 21 */            l10loil00ooo.I00000oOI = str3;
/* 23 */            l10loil00ooo.I0000Il00O = str;
/* 25 */            l10loil00ooo.I0000O = str2;
/* 27 */            l10loil00ooo.I0000oI00 = this;
/* 29 */            VarHandle.storeStoreFence();
                    try {
/* 40 */                return (List) l0o10ooo0I00iOIl.I010l1ol111(l10loil00ooo).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 52 */                lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Failed to get conditional user properties", e);
/* 55 */                return Collections.EMPTY_LIST;
                    }
                }

                @Override
                public final void I000l1(lli10iI lli10ii) {
/* 3 */             lII0I0I000I.I0000O(lli10ii.I00iOIl);
/* 8 */             lII0I0I000I.I000II(lli10ii.I00oII);
/* 15 */            iooili01 iooili01Var = new iooili01(8);
/* 18 */            iooili01Var.I00iiI = lli10ii;
/* 20 */            iooili01Var.I00iiO = this;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            I0000O(iooili01Var);
                }

                @Override
                public final void I000o00OoI0I(long j, String str, String str2, String str3) {
/* 4 */             Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(1);
/* 7 */             oo1ooo0ollI.I00iiO = str2;
/* 9 */             oo1ooo0ollI.I00iio = str3;
/* 11 */            oo1ooo0ollI.I00ilI0I1 = str;
/* 13 */            oo1ooo0ollI.I00iiI = j;
/* 15 */            oo1ooo0ollI.I00ilO0 = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00IoO0(oo1ooo0ollI);
                }

                @Override
                public final iO0Ol0ol I000oI1ioi(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 18 */            l0ooiII1Ol l0ooiii1ol = new l0ooiII1Ol(1);
/* 21 */            l0ooiii1ol.I0000Il00O = lli10ii;
/* 23 */            l0ooiii1ol.I00000oOI = this;
/* 25 */            VarHandle.storeStoreFence();
                    try {
/* 40 */                return (iO0Ol0ol) l0o10ooo0I00iOIl.I010lI0oi(l0ooiii1ol).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 56 */                lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to get consent. appId", e);
/* 62 */                return new iO0Ol0ol(null);
                    }
                }

                @Override
                public final List I00100l0(String str, String str2, String str3) throws PackageManager.NameNotFoundException {
/* 2 */             I00IoIO0lI(str, true);
/* 5 */             lilOOl0 lilool0 = this.I000II;
/* 7 */             l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 14 */            l10loil00OOO l10loil00ooo = new l10loil00OOO(3);
/* 17 */            l10loil00ooo.I00000oOI = str;
/* 19 */            l10loil00ooo.I0000Il00O = str2;
/* 21 */            l10loil00ooo.I0000O = str3;
/* 23 */            l10loil00ooo.I0000oI00 = this;
/* 25 */            VarHandle.storeStoreFence();
                    try {
/* 36 */                return (List) l0o10ooo0I00iOIl.I010l1ol111(l10loil00ooo).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 48 */                lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Failed to get conditional user properties as", e);
/* 51 */                return Collections.EMPTY_LIST;
                    }
                }

                @Override
                public final void I00100o1O0lo(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 7 */             liOO1i1 lioo1i1 = new liOO1i1(7);
/* 10 */            lioo1i1.I00iiI = lli10ii;
/* 12 */            lioo1i1.I00iiO = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I00IoO0(lioo1i1);
                }

                @Override
                public final void I0010o(lli10iI lli10ii) {
/* 3 */             lII0I0I000I.I0000O(lli10ii.I00iOIl);
/* 8 */             lII0I0I000I.I000II(lli10ii.I00oII);
/* 15 */            l0iOoII1Il l0iooii1il = new l0iOoII1Il(8);
/* 18 */            l0iooii1il.I00iiI = this;
/* 20 */            l0iooii1il.I00iiO = lli10ii;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            I0000O(l0iooii1il);
                }

                @Override
                public final void I00111O(lli10iI lli10ii, liIlli liilli, iooliIoiiOlo iooliioiiolo) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I000II(str);
/* 11 */            l0o10OoO0 l0o10ooo0I00iOIl = this.I000II.I00iOIl();
/* 18 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(6);
/* 21 */            iO0iIlI1li.I00iiI = this;
/* 23 */            iO0iIlI1li.I00iiO = str;
/* 25 */            iO0iIlI1li.I00iio = liilli;
/* 27 */            iO0iIlI1li.I00ilI0I1 = iooliioiiolo;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            l0o10ooo0I00iOIl.I010o0o0oO(iO0iIlI1li);
                }

                @Override
                public final void I001IO000(lli10iI lli10ii) {
/* 3 */             lII0I0I000I.I0000O(lli10ii.I00iOIl);
/* 8 */             lII0I0I000I.I000II(lli10ii.I00oII);
/* 15 */            l0001OI0 l0001oi0 = new l0001OI0(8);
/* 18 */            l0001oi0.I00iiI = this;
/* 20 */            l0001oi0.I00iiO = lli10ii;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            I0000O(l0001oi0);
                }

                @Override
                public final void I001i1O0Ol(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 8 */             illioiliioi illioiliioiVar = new illioiliioi(8);
/* 11 */            illioiliioiVar.I00iiI = lli10ii;
/* 13 */            illioiliioiVar.I00iiO = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            I00IoO0(illioiliioiVar);
                }

                @Override
                public final void I001iOo1i0O(iII000ol000 iii000ol000, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             lII0I0I000I.I000II(iii000ol000);
/* 6 */             lII0I0I000I.I000II(iii000ol000.I00iiO);
/* 9 */             I0000oI00(lli10ii);
/* 14 */            iII000ol000 iii000ol0002 = new iII000ol000(iii000ol000);
/* 19 */            iii000ol0002.I00iOIl = lli10ii.I00iOIl;
/* 25 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(11);
/* 28 */            o10oO1IiI1.I00iiI = iii000ol0002;
/* 30 */            o10oO1IiI1.I00iiO = lli10ii;
/* 32 */            o10oO1IiI1.I00iio = this;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            I00IoO0(o10oO1IiI1);
                }

                @Override
                public final void I00II0Ol1O0l(lio0llOI0 lio0lloi0, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             lII0I0I000I.I000II(lio0lloi0);
/* 4 */             I0000oI00(lli10ii);
/* 11 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(14);
/* 14 */            o10oO1IiI1.I00iiI = lio0lloi0;
/* 16 */            o10oO1IiI1.I00iiO = lli10ii;
/* 18 */            o10oO1IiI1.I00iio = this;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I00IoO0(o10oO1IiI1);
                }

                @Override
                public final byte[] I00IO1oi11O(String str, ii0oooi0IO0l ii0oooi0io0l) throws PackageManager.NameNotFoundException {
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             lII0I0I000I.I000II(ii0oooi0io0l);
/* 8 */             I00IoIO0lI(str, true);
/* 11 */            lilOOl0 lilool0 = this.I000II;
/* 17 */            IOloiOI1 iOloiOI1 = lilool0.I00II0oii1o().I00lli11;
/* 19 */            l0olllO1i l0olllo1i = lilool0.I00ll1;
/* 21 */            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 23 */            String str2 = ii0oooi0io0l.I00iOIl;
/* 31 */            iOloiOI1.I0000Il00O("Log and bundle. event", l00i1l00olio.I00000oIO(str2));
/* 38 */            lilool0.I00IoO0().getClass();
/* 48 */            long jNanoTime = System.nanoTime() / 1000000;
/* 49 */            l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 56 */            Io11llo0i io11llo0i = new Io11llo0i(7);
/* 59 */            io11llo0i.I00000oOI = this;
/* 61 */            VarHandle.storeStoreFence();
                    try {
/* 72 */                byte[] bArr = (byte[]) l0o10ooo0I00iOIl.I010lI0oi(io11llo0i).get();
/* 74 */                if (bArr == null) {
/* 88 */                    lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Log and bundle returned null. appId", l01O0IO1ooO0.I010ioo(str));
/* 92 */                    bArr = new byte[0];
                        }
/* 101 */               lilool0.I00IoO0().getClass();
/* 133 */               lilool0.I00II0oii1o().I00lli11.I0000oI00("Log and bundle processed. event, size, time_ms", l0olllo1i.I00l0OO0IO.I00000oIO(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
/* 136 */               return bArr;
                    } catch (InterruptedException | ExecutionException e) {
/* 155 */               lilool0.I00II0oii1o().I00ilO0.I0000oI00("Failed to log and bundle. appId, event, error", l01O0IO1ooO0.I010ioo(str), l0olllo1i.I00l0OO0IO.I00000oIO(str2), e);
/* 158 */               return null;
                    }
                }

                @Override
                public final void I00IOO(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             String str = lli10ii.I00iOIl;
/* 3 */             lII0I0I000I.I0000O(str);
/* 7 */             I00IoIO0lI(str, false);
/* 14 */            iooiio1i0 iooiio1i0Var = new iooiio1i0(8);
/* 17 */            iooiio1i0Var.I00iiI = lli10ii;
/* 19 */            iooiio1i0Var.I00iiO = this;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            I00IoO0(iooiio1i0Var);
                }

                @Override
                public final void I00IioO0OiOi(lli10iI lli10ii, iI0iiII1i ii0iiii1i) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 8 */             O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(15);
/* 11 */            o10oO1IiI1.I00iiI = this;
/* 13 */            o10oO1IiI1.I00iiO = lli10ii;
/* 15 */            o10oO1IiI1.I00iio = ii0iiii1i;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00IoO0(o10oO1IiI1);
                }

                @Override
                public final void I00IlilI0i0i(lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 8 */             IlloOIoilIl illoOIoilIl = new IlloOIoilIl(8);
/* 11 */            illoOIoilIl.I00iiI = lli10ii;
/* 13 */            illoOIoilIl.I00iiO = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            I00IoO0(illoOIoilIl);
                }

                @Override
                public final void I00Io1lO(Bundle bundle, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I000II(str);
/* 13 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(8);
/* 16 */            iO0iIlI1li.I00iiI = this;
/* 18 */            iO0iIlI1li.I00iiO = bundle;
/* 20 */            iO0iIlI1li.I00iio = str;
/* 22 */            iO0iIlI1li.I00ilI0I1 = lli10ii;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00IoO0(iO0iIlI1li);
                }

                @Override
                public final List I00Io1o110i(String str, String str2, boolean z, lli10iI lli10ii) throws PackageManager.NameNotFoundException {
/* 1 */             I0000oI00(lli10ii);
/* 4 */             String str3 = lli10ii.I00iOIl;
/* 6 */             lII0I0I000I.I000II(str3);
/* 9 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 18 */            l10loil00OOO l10loil00ooo = new l10loil00OOO(0);
/* 21 */            l10loil00ooo.I00000oOI = str3;
/* 23 */            l10loil00ooo.I0000Il00O = str;
/* 25 */            l10loil00ooo.I0000O = str2;
/* 27 */            l10loil00ooo.I0000oI00 = this;
/* 29 */            VarHandle.storeStoreFence();
                    try {
/* 40 */                List<lioOO0ioOI> list = (List) l0o10ooo0I00iOIl.I010l1ol111(l10loil00ooo).get();
/* 48 */                ArrayList arrayList = new ArrayList(list.size());
/* 59 */                for (lioOO0ioOI liooo0iooi : list) {
/* 67 */                    if (z || !lioil0ilIOi.I01I1Oo0oll(liooo0iooi.I0000Il00O)) {
/* 85 */                        arrayList.add(new lio0llOI0(liooo0iooi));
                            }
                        }
/* 89 */                return arrayList;
                    } catch (InterruptedException | ExecutionException e) {
/* 102 */               lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str3), "Failed to query user properties. appId", e);
/* 105 */               return Collections.EMPTY_LIST;
                    }
                }

                public final void I00IoIO0lI(String str, boolean z) throws PackageManager.NameNotFoundException {
                    PackageInfo packageInfo;
                    Io0ii1o0 io0ii1o0I00000oIO;
                    boolean z2;
/* 3 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            if (TextUtils.isEmpty(str)) {
/* 216 */               lilool0.I00II0oii1o().I00ilO0.I00000oOI("Measurement Service called without app package");
/* 332 */               throw new SecurityException("Measurement Service called without app package");
                    }
/* 13 */            if (z) {
                        try {
/* 15 */                    Boolean boolValueOf = this.I000O01llI0;
/* 17 */                    if (boolValueOf == null) {
/* 25 */                        boolean z3 = true;
/* 26 */                        if (!"com.google.android.gms".equals(this.I000OOo1O)) {
/* 30 */                            Context context = lilool0.I00ll1.I00iOIl;
/* 41 */                            if (lOooIO1oiI.I00000oIO(Binder.getCallingUid(), context, "com.google.android.gms")) {
                                        try {
/* 50 */                                    packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
/* 54 */                                    io0ii1o0I00000oIO = Io0ii1o0.I00000oIO(context);
                                        } catch (PackageManager.NameNotFoundException unused) {
/* 96 */                                    Log.isLoggable("UidVerifier", 3);
                                        }
/* 58 */                                if (packageInfo != null) {
/* 65 */                                    if (!Io0ii1o0.I0000Il00O(packageInfo, false)) {
/* 72 */                                        if (Io0ii1o0.I0000Il00O(packageInfo, true)) {
/* 80 */                                            if (!Io0ii0lOoi.I00000oOI(io0ii1o0I00000oIO.I00000oIO)) {
/* 88 */                                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                                    }
                                                }
                                            }
/* 82 */                                    z2 = true;
/* 100 */                                   if (!z2 && !Io0ii1o0.I00000oIO(lilool0.I00ll1.I00iOIl).I00000oOI(Binder.getCallingUid())) {
/* 121 */                                       z3 = false;
                                            }
                                        }
                                    }
/* 91 */                            z2 = false;
/* 100 */                           if (!z2) {
/* 121 */                               z3 = false;
                                    }
                                }
/* 125 */                       boolValueOf = Boolean.valueOf(z3);
/* 129 */                       this.I000O01llI0 = boolValueOf;
                            }
/* 135 */                   if (boolValueOf.booleanValue()) {
/* 168 */                       return;
                            }
                        } catch (SecurityException e) {
/* 204 */                   lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Measurement Service called with invalid calling package. appId", l01O0IO1ooO0.I010ioo(str));
/* 207 */                   throw e;
                        }
                    }
/* 140 */           if (this.I000OOo1O == null) {
/* 144 */               Context context2 = lilool0.I00ll1.I00iOIl;
/* 146 */               int callingUid = Binder.getCallingUid();
/* 150 */               int i = Io0ii0lOoi.I0000oI00;
/* 156 */               if (lOooIO1oiI.I00000oIO(callingUid, context2, str)) {
/* 158 */                   this.I000OOo1O = str;
                        }
                    }
/* 166 */           if (str.equals(this.I000OOo1O)) {
/* 168 */               return;
                    }
/* 191 */           throw new SecurityException("Unknown calling package name '" + str + "'.");
                }

                public final void I00IoO0(Runnable runnable) {
/* 1 */             lilOOl0 lilool0 = this.I000II;
/* 11 */            if (lilool0.I00iOIl().I010l1O()) {
/* 13 */                runnable.run();
                    } else {
/* 21 */                lilool0.I00iOIl().I010o0o0oO(runnable);
                    }
                }
            }
