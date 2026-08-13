            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteConstraintException;
            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.regex.Pattern;
            
            public final class O11iIIOO01i0 extends Oll0io implements IlliIl1l11O {
                public String I00iOIl;
                public OI11ol I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public String I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public final List I00l0OO0IO;
                public final Context I00li1OI;
                public final O11iO00I1o I00ll1;
                public final O1oIOiI11o0 I00lli11;
                public final IO1loOo1o I00lll10;
                public final String I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11iIIOO01i0(List list, Context context, O11iO00I1o o11iO00I1o, O1oIOiI11o0 o1oIOiI11o0, IO1loOo1o iO1loOo1o, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00l0OO0IO = list;
/* 3 */             this.I00li1OI = context;
/* 5 */             this.I00ll1 = o11iO00I1o;
/* 7 */             this.I00lli11 = o1oIOiI11o0;
/* 9 */             this.I00lll10 = iO1loOo1o;
/* 11 */            this.I00o0iI0io1 = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new O11iIIOO01i0(this.I00l0OO0IO, this.I00li1OI, this.I00ll1, this.I00lli11, this.I00lll10, this.I00o0iI0io1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O11iIIOO01i0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x02b3  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x0304  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0159 A[Catch: all -> 0x01b9, TRY_LEAVE, TryCatch #17 {all -> 0x01b9, blocks: (B:57:0x0155, B:59:0x0159), top: B:162:0x0155 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI11ol oI11ol;
                    String str;
                    String strI00IlilI0i0i;
                    OI1I0OoOl oI1I0OoOl;
                    String str2;
                    String str3;
                    O11iO00I1o o11iO00I1o;
                    IO1loOo1o iO1loOo1o;
                    O1oIOiI11o0 o1oIOiI11o0;
                    int i;
                    Context context;
                    String id;
                    OI11ol oI11ol2;
                    String str4;
                    O11iIIOO01i0 o11iIIOO01i0;
                    String str5;
                    IO1loOo1o iO1loOo1o2;
                    int i2;
                    int i3;
                    Object objI00000oIO;
                    IO1loOo1o iO1loOo1o3;
                    O11iO00I1o o11iO00I1o2;
                    int i4;
                    int i5;
                    String str6;
                    String str7;
                    int i6;
                    String str8;
                    int i7;
                    OI11ol oI11ol3;
                    OI11ol oI11ol4;
                    int i8;
                    String str9;
                    int i9;
                    String str10;
                    IO1loOo1o iO1loOo1o4;
                    String str11;
                    int i10;
                    int i11;
                    OI11ol oI11ol5;
                    int i12;
                    String str12;
                    int i13;
                    String str13;
                    IO1loOo1o iO1loOo1o5;
                    String str14;
                    int i14;
                    int i15;
                    OI11ol oI11ol6;
                    String string;
                    String str15;
                    int i16;
                    int i17;
                    String str16;
                    String str17;
                    IO1loOo1o iO1loOo1o6;
                    OI11ol oI11ol7;
                    String string2;
/* 1 */             O11iIIOO01i0 o11iIIOO01i02 = this;
/* 3 */             List list = o11iIIOO01i02.I00l0OO0IO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                    try {
                        try {
                        } catch (Throwable th) {
/* 106 */                   th = th;
/* 107 */                   oI11ol = null;
                        }
                    } catch (Exception e) {
/* 869 */               Log.e("AGLlmChatViewModel", "Failed to persist user message", e);
                    }
                    switch (o11iIIOO01i02.I00l0I0l0lO1) {
                        case 0:
/* 225 */                   lIoii1l01l0i.I00000oOI(obj);
/* 235 */                   if (!list.isEmpty() && (context = o11iIIOO01i02.I00li1OI) != null) {
/* 245 */                       ArrayList arrayList = new ArrayList();
/* 248 */                       Iterator it = list.iterator();
/* 256 */                       while (it.hasNext()) {
/* 264 */                           String strI00000oOI = i1Iolo.I00000oOI(context, (Bitmap) it.next());
/* 268 */                           if (strI00000oOI != null) {
/* 270 */                               arrayList.add(strI00000oOI);
                                    }
                                }
/* 278 */                       if (!arrayList.isEmpty()) {
/* 292 */                           strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(arrayList, ",", null, null, null, 62);
                                }
/* 298 */                       O11iO00I1o o11iO00I1o3 = o11iIIOO01i02.I00ll1;
/* 300 */                       oI1I0OoOl = o11iO00I1o3.I000II;
/* 302 */                       O1oIOiI11o0 o1oIOiI11o02 = o11iIIOO01i02.I00lli11;
/* 304 */                       IO1loOo1o iO1loOo1o7 = o11iIIOO01i02.I00lll10;
/* 306 */                       String str18 = o11iIIOO01i02.I00o0iI0io1;
/* 308 */                       o11iIIOO01i02.I00iOIl = strI00IlilI0i0i;
/* 310 */                       o11iIIOO01i02.I00iiI = oI1I0OoOl;
/* 312 */                       o11iIIOO01i02.I00iiO = o11iO00I1o3;
/* 314 */                       o11iIIOO01i02.I00iio = o1oIOiI11o02;
/* 316 */                       o11iIIOO01i02.I00ilI0I1 = iO1loOo1o7;
/* 318 */                       o11iIIOO01i02.I00ilO0 = str18;
/* 320 */                       o11iIIOO01i02.I00io1l = 0;
/* 323 */                       o11iIIOO01i02.I00l0I0l0lO1 = 1;
/* 329 */                       if (oI1I0OoOl.I00000oIO(o11iIIOO01i02) != ii0111o) {
                                }
/* 847 */                       return ii0111o;
                            }
/* 297 */                   strI00IlilI0i0i = null;
/* 298 */                   O11iO00I1o o11iO00I1o32 = o11iIIOO01i02.I00ll1;
/* 300 */                   oI1I0OoOl = o11iO00I1o32.I000II;
/* 302 */                   O1oIOiI11o0 o1oIOiI11o022 = o11iIIOO01i02.I00lli11;
/* 304 */                   IO1loOo1o iO1loOo1o72 = o11iIIOO01i02.I00lll10;
/* 306 */                   String str182 = o11iIIOO01i02.I00o0iI0io1;
/* 308 */                   o11iIIOO01i02.I00iOIl = strI00IlilI0i0i;
/* 310 */                   o11iIIOO01i02.I00iiI = oI1I0OoOl;
/* 312 */                   o11iIIOO01i02.I00iiO = o11iO00I1o32;
/* 314 */                   o11iIIOO01i02.I00iio = o1oIOiI11o022;
/* 316 */                   o11iIIOO01i02.I00ilI0I1 = iO1loOo1o72;
/* 318 */                   o11iIIOO01i02.I00ilO0 = str182;
/* 320 */                   o11iIIOO01i02.I00io1l = 0;
/* 323 */                   o11iIIOO01i02.I00l0I0l0lO1 = 1;
/* 329 */                   if (oI1I0OoOl.I00000oIO(o11iIIOO01i02) != ii0111o) {
/* 334 */                       str2 = strI00IlilI0i0i;
/* 335 */                       str3 = str182;
/* 337 */                       o11iO00I1o = o11iO00I1o32;
/* 338 */                       oI11ol = oI1I0OoOl;
/* 339 */                       iO1loOo1o = iO1loOo1o72;
/* 340 */                       o1oIOiI11o0 = o1oIOiI11o022;
/* 341 */                       i = 0;
                                try {
/* 342 */                           id = o11iO00I1o.I0001Ioi1lo;
/* 344 */                           if (id != null) {
/* 346 */                               String str19 = o1oIOiI11o0.I00000oIO;
/* 350 */                               String strI00OIl = OlOoOIi0o.I00OIl(50, str3);
/* 356 */                               String str20 = o1oIOiI11o0.I00000oIO;
/* 364 */                               String str21 = (String) o11iO00I1o.I000OOo1O.getValue();
/* 366 */                               o11iIIOO01i02.I00iOIl = str2;
/* 368 */                               o11iIIOO01i02.I00iiI = oI11ol;
/* 370 */                               o11iIIOO01i02.I00iiO = o11iO00I1o;
/* 372 */                               o11iIIOO01i02.I00iio = iO1loOo1o;
/* 374 */                               o11iIIOO01i02.I00ilI0I1 = str3;
/* 376 */                               o11iIIOO01i02.I00ilO0 = null;
/* 378 */                               o11iIIOO01i02.I00io1l = i;
/* 381 */                               o11iIIOO01i02.I00ioIO = 0;
/* 384 */                               o11iIIOO01i02.I00l0I0l0lO1 = 2;
/* 386 */                               O11iO00I1o o11iO00I1o4 = o11iO00I1o;
/* 389 */                               str4 = str2;
/* 390 */                               o11iIIOO01i0 = o11iIIOO01i02;
/* 391 */                               str5 = str3;
/* 392 */                               IO1loOo1o iO1loOo1o8 = iO1loOo1o;
/* 395 */                               oI11ol2 = oI11ol;
                                        try {
/* 398 */                                   objI00000oIO = iO1loOo1o8.I00000oIO(strI00OIl, "llm_chat", str20, str21, o11iIIOO01i0);
/* 402 */                                   if (objI00000oIO != ii0111o) {
/* 406 */                                       iO1loOo1o3 = iO1loOo1o8;
/* 407 */                                       o11iO00I1o2 = o11iO00I1o4;
/* 408 */                                       i4 = i;
/* 409 */                                       i5 = 0;
/* 411 */                                       Conversation conversation = (Conversation) objI00000oIO;
/* 417 */                                       o11iO00I1o2.I0001Ioi1lo = conversation.getId();
/* 419 */                                       conversation.getId();
/* 422 */                                       id = conversation.getId();
/* 426 */                                       iO1loOo1o2 = iO1loOo1o3;
/* 427 */                                       i3 = i5;
/* 429 */                                       i2 = i4;
/* 430 */                                       str6 = str4;
/* 431 */                                       String str22 = str5;
/* 432 */                                       str7 = id;
/* 433 */                                       OI11ol oI11ol8 = oI11ol2;
/* 456 */                                       if (str6 != null) {
                                                    try {
/* 463 */                                               o11iIIOO01i0.I00iOIl = null;
/* 465 */                                               o11iIIOO01i0.I00iiI = oI11ol8;
/* 467 */                                               o11iIIOO01i0.I00iiO = iO1loOo1o2;
/* 469 */                                               o11iIIOO01i0.I00iio = str22;
/* 471 */                                               o11iIIOO01i0.I00ilI0I1 = str7;
/* 473 */                                               o11iIIOO01i0.I00ilO0 = null;
/* 475 */                                               o11iIIOO01i0.I00io1l = i2;
/* 477 */                                               o11iIIOO01i0.I00ioIO = i3;
                                                        try {
/* 480 */                                                   o11iIIOO01i0.I00l0I0l0lO1 = 3;
/* 482 */                                                   int i18 = i2;
/* 483 */                                                   str10 = str7;
/* 486 */                                                   i8 = i18;
/* 490 */                                                   str9 = str22;
/* 492 */                                                   i9 = i3;
/* 495 */                                                   oI11ol4 = oI11ol8;
/* 497 */                                                   str = null;
/* 498 */                                                   o11iIIOO01i02 = this;
                                                            try {
                                                                try {
                                                                } catch (Exception e2) {
/* 537 */                                                           e = e2;
/* 538 */                                                           iO1loOo1o4 = iO1loOo1o2;
/* 539 */                                                           str11 = str10;
/* 540 */                                                           i10 = i8;
/* 542 */                                                           str8 = str9;
/* 544 */                                                           oI11ol = oI11ol4;
                                                                    try {
/* 585 */                                                               Log.e("AGLlmChatViewModel", "Failed to save image message", e);
/* 588 */                                                               str7 = str11;
/* 589 */                                                               i6 = i10;
/* 590 */                                                               oI11ol3 = oI11ol;
/* 591 */                                                               iO1loOo1o2 = iO1loOo1o4;
/* 592 */                                                               i7 = i9;
                                                                        try {
                                                                            try {
/* 645 */                                                                       string = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str8), "\u0000", "")).replaceAll("")).toString();
                                                                            } catch (Throwable th2) {
/* 708 */                                                                       th = th2;
/* 709 */                                                                       oI11ol4 = oI11ol3;
/* 533 */                                                                       oI11ol = oI11ol4;
/* 863 */                                                                       oI11ol.I00000oOI(str);
/* 866 */                                                                       throw th;
                                                                            }
                                                                        } catch (SQLiteConstraintException e3) {
/* 728 */                                                                   e = e3;
/* 729 */                                                                   oI11ol4 = oI11ol3;
/* 731 */                                                                   i12 = i6;
/* 733 */                                                                   str12 = str8;
/* 735 */                                                                   i13 = i7;
/* 737 */                                                                   str13 = str7;
                                                                        }
                                                                        try {
/* 649 */                                                                   o11iIIOO01i02.I00iOIl = str;
/* 651 */                                                                   o11iIIOO01i02.I00iiI = oI11ol3;
/* 653 */                                                                   o11iIIOO01i02.I00iiO = iO1loOo1o2;
/* 655 */                                                                   o11iIIOO01i02.I00iio = str8;
/* 657 */                                                                   o11iIIOO01i02.I00ilI0I1 = str7;
/* 659 */                                                                   o11iIIOO01i02.I00ilO0 = str;
/* 661 */                                                                   o11iIIOO01i02.I00io1l = i6;
/* 663 */                                                                   o11iIIOO01i02.I00ioIO = i7;
/* 666 */                                                                   o11iIIOO01i02.I00l0I0l0lO1 = 4;
/* 668 */                                                                   oI11ol4 = oI11ol3;
/* 670 */                                                                   i13 = i7;
/* 672 */                                                                   str13 = str7;
/* 675 */                                                                   str12 = str8;
/* 681 */                                                                   i12 = i6;
                                                                            try {
/* 688 */                                                                       if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str13, "user", string, 0L, null, o11iIIOO01i02, 56) != ii0111o) {
                                                                                }
                                                                            } catch (SQLiteConstraintException e4) {
/* 696 */                                                                       e = e4;
/* 697 */                                                                       iO1loOo1o5 = iO1loOo1o2;
/* 698 */                                                                       str14 = str13;
/* 699 */                                                                       i14 = i12;
/* 701 */                                                                       str8 = str12;
/* 703 */                                                                       i15 = i13;
/* 705 */                                                                       oI11ol6 = oI11ol4;
                                                                                try {
/* 741 */                                                                           Log.w("AGLlmChatViewModel", "Foreign key constraint failed, conversation might not be committed yet. Retrying...", e);
/* 744 */                                                                           o11iIIOO01i02.I00iOIl = str;
/* 746 */                                                                           o11iIIOO01i02.I00iiI = oI11ol6;
/* 748 */                                                                           o11iIIOO01i02.I00iiO = iO1loOo1o5;
/* 750 */                                                                           o11iIIOO01i02.I00iio = str8;
/* 752 */                                                                           o11iIIOO01i02.I00ilI0I1 = str14;
/* 754 */                                                                           o11iIIOO01i02.I00ilO0 = str;
/* 756 */                                                                           o11iIIOO01i02.I00io1l = i14;
/* 758 */                                                                           o11iIIOO01i02.I00ioIO = i15;
/* 761 */                                                                           o11iIIOO01i02.I00l0I0l0lO1 = 5;
/* 11 */                                                                            str15 = "";
/* 770 */                                                                           if (il0l1o1l.I00000oOI(100L, o11iIIOO01i02) != ii0111o) {
/* 773 */                                                                               i16 = i15;
/* 774 */                                                                               i17 = i14;
/* 775 */                                                                               str16 = str14;
/* 776 */                                                                               str17 = str8;
/* 777 */                                                                               iO1loOo1o6 = iO1loOo1o5;
/* 778 */                                                                               oI11ol7 = oI11ol6;
                                                                                        try {
/* 807 */                                                                                   string2 = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str17), "\u0000", str15)).replaceAll(str15)).toString();
/* 812 */                                                                                   o11iIIOO01i02.I00iOIl = null;
/* 814 */                                                                                   o11iIIOO01i02.I00iiI = oI11ol7;
/* 816 */                                                                                   o11iIIOO01i02.I00iiO = str16;
/* 818 */                                                                                   o11iIIOO01i02.I00iio = null;
/* 820 */                                                                                   o11iIIOO01i02.I00ilI0I1 = null;
/* 822 */                                                                                   o11iIIOO01i02.I00ilO0 = null;
/* 824 */                                                                                   o11iIIOO01i02.I00io1l = i17;
/* 826 */                                                                                   o11iIIOO01i02.I00ioIO = i16;
/* 829 */                                                                                   o11iIIOO01i02.I00l0I0l0lO1 = 6;
/* 845 */                                                                                   if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o6, str16, "user", string2, 0L, null, this, 56) != ii0111o) {
                                                                                            }
                                                                                        } catch (Throwable th3) {
/* 855 */                                                                                   th = th3;
/* 856 */                                                                                   oI11ol = oI11ol7;
/* 439 */                                                                                   str = null;
/* 863 */                                                                                   oI11ol.I00000oOI(str);
/* 866 */                                                                                   throw th;
                                                                                        }
                                                                                    }
/* 847 */                                                                           return ii0111o;
                                                                                } catch (Throwable th4) {
/* 859 */                                                                           th = th4;
/* 860 */                                                                           oI11ol = oI11ol6;
/* 439 */                                                                           str = null;
/* 863 */                                                                           oI11ol.I00000oOI(str);
/* 866 */                                                                           throw th;
                                                                                }
                                                                            }
                                                                        } catch (SQLiteConstraintException e5) {
/* 713 */                                                                   e = e5;
/* 714 */                                                                   oI11ol4 = oI11ol3;
/* 716 */                                                                   int i19 = i6;
/* 720 */                                                                   i13 = i7;
/* 723 */                                                                   iO1loOo1o5 = iO1loOo1o2;
/* 724 */                                                                   str14 = str7;
/* 725 */                                                                   i14 = i19;
/* 703 */                                                                   i15 = i13;
/* 705 */                                                                   oI11ol6 = oI11ol4;
/* 741 */                                                                   Log.w("AGLlmChatViewModel", "Foreign key constraint failed, conversation might not be committed yet. Retrying...", e);
/* 744 */                                                                   o11iIIOO01i02.I00iOIl = str;
/* 746 */                                                                   o11iIIOO01i02.I00iiI = oI11ol6;
/* 748 */                                                                   o11iIIOO01i02.I00iiO = iO1loOo1o5;
/* 750 */                                                                   o11iIIOO01i02.I00iio = str8;
/* 752 */                                                                   o11iIIOO01i02.I00ilI0I1 = str14;
/* 754 */                                                                   o11iIIOO01i02.I00ilO0 = str;
/* 756 */                                                                   o11iIIOO01i02.I00io1l = i14;
/* 758 */                                                                   o11iIIOO01i02.I00ioIO = i15;
/* 761 */                                                                   o11iIIOO01i02.I00l0I0l0lO1 = 5;
/* 11 */                                                                    str15 = "";
/* 770 */                                                                   if (il0l1o1l.I00000oOI(100L, o11iIIOO01i02) != ii0111o) {
                                                                            }
/* 847 */                                                                   return ii0111o;
                                                                        }
/* 847 */                                                               return ii0111o;
                                                                    } catch (Throwable th5) {
/* 595 */                                                               th = th5;
/* 863 */                                                               oI11ol.I00000oOI(str);
/* 866 */                                                               throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th6) {
/* 532 */                                                       th = th6;
/* 533 */                                                       oI11ol = oI11ol4;
/* 863 */                                                       oI11ol.I00000oOI(str);
/* 866 */                                                       throw th;
                                                            }
                                                        } catch (Exception e6) {
/* 552 */                                                   e = e6;
/* 553 */                                                   i8 = i2;
/* 555 */                                                   str9 = str22;
/* 557 */                                                   i9 = i3;
/* 559 */                                                   o11iIIOO01i02 = o11iIIOO01i0;
/* 560 */                                                   str10 = str7;
/* 561 */                                                   oI11ol4 = oI11ol8;
/* 563 */                                                   str = null;
                                                        } catch (Throwable th7) {
/* 547 */                                                   th = th7;
/* 548 */                                                   oI11ol4 = oI11ol8;
/* 550 */                                                   str = null;
/* 533 */                                                   oI11ol = oI11ol4;
/* 863 */                                                   oI11ol.I00000oOI(str);
/* 866 */                                                   throw th;
                                                        }
                                                    } catch (Exception e7) {
/* 570 */                                               e = e7;
/* 571 */                                               i8 = i2;
/* 573 */                                               str9 = str22;
/* 575 */                                               i9 = i3;
/* 577 */                                               o11iIIOO01i02 = o11iIIOO01i0;
/* 578 */                                               str10 = str7;
/* 579 */                                               oI11ol4 = oI11ol8;
/* 581 */                                               str = null;
                                                    } catch (Throwable th8) {
/* 565 */                                               th = th8;
/* 566 */                                               oI11ol4 = oI11ol8;
/* 568 */                                               str = null;
                                                    }
/* 505 */                                           if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str10, "user_image", "", 0L, str6, o11iIIOO01i02, 24) != ii0111o) {
/* 509 */                                               iO1loOo1o4 = iO1loOo1o2;
/* 510 */                                               str11 = str10;
/* 511 */                                               i10 = i8;
/* 513 */                                               str8 = str9;
/* 515 */                                               i11 = i9;
/* 517 */                                               oI11ol5 = oI11ol4;
/* 519 */                                               IO1loOo1o iO1loOo1o9 = iO1loOo1o4;
/* 521 */                                               i7 = i11;
/* 522 */                                               iO1loOo1o2 = iO1loOo1o9;
/* 524 */                                               String str23 = str11;
/* 526 */                                               i6 = i10;
/* 527 */                                               oI11ol3 = oI11ol5;
/* 528 */                                               str7 = str23;
/* 645 */                                               string = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str8), "\u0000", "")).replaceAll("")).toString();
/* 649 */                                               o11iIIOO01i02.I00iOIl = str;
/* 651 */                                               o11iIIOO01i02.I00iiI = oI11ol3;
/* 653 */                                               o11iIIOO01i02.I00iiO = iO1loOo1o2;
/* 655 */                                               o11iIIOO01i02.I00iio = str8;
/* 657 */                                               o11iIIOO01i02.I00ilI0I1 = str7;
/* 659 */                                               o11iIIOO01i02.I00ilO0 = str;
/* 661 */                                               o11iIIOO01i02.I00io1l = i6;
/* 663 */                                               o11iIIOO01i02.I00ioIO = i7;
/* 666 */                                               o11iIIOO01i02.I00l0I0l0lO1 = 4;
/* 668 */                                               oI11ol4 = oI11ol3;
/* 670 */                                               i13 = i7;
/* 672 */                                               str13 = str7;
/* 675 */                                               str12 = str8;
/* 681 */                                               i12 = i6;
/* 688 */                                               if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str13, "user", string, 0L, null, o11iIIOO01i02, 56) != ii0111o) {
/* 692 */                                                   oI11ol6 = oI11ol4;
/* 851 */                                                   oI11ol6.I00000oOI(str);
                                                        }
                                                    }
                                                } else {
/* 602 */                                           int i20 = i3;
/* 604 */                                           o11iIIOO01i02 = o11iIIOO01i0;
/* 608 */                                           str = null;
/* 609 */                                           i6 = i2;
/* 611 */                                           str8 = str22;
/* 613 */                                           i7 = i20;
/* 615 */                                           oI11ol3 = oI11ol8;
/* 645 */                                           string = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str8), "\u0000", "")).replaceAll("")).toString();
/* 649 */                                           o11iIIOO01i02.I00iOIl = str;
/* 651 */                                           o11iIIOO01i02.I00iiI = oI11ol3;
/* 653 */                                           o11iIIOO01i02.I00iiO = iO1loOo1o2;
/* 655 */                                           o11iIIOO01i02.I00iio = str8;
/* 657 */                                           o11iIIOO01i02.I00ilI0I1 = str7;
/* 659 */                                           o11iIIOO01i02.I00ilO0 = str;
/* 661 */                                           o11iIIOO01i02.I00io1l = i6;
/* 663 */                                           o11iIIOO01i02.I00ioIO = i7;
/* 666 */                                           o11iIIOO01i02.I00l0I0l0lO1 = 4;
/* 668 */                                           oI11ol4 = oI11ol3;
/* 670 */                                           i13 = i7;
/* 672 */                                           str13 = str7;
/* 675 */                                           str12 = str8;
/* 681 */                                           i12 = i6;
/* 688 */                                           if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str13, "user", string, 0L, null, o11iIIOO01i02, 56) != ii0111o) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th9) {
/* 436 */                                   th = th9;
/* 437 */                                   oI11ol = oI11ol2;
/* 439 */                                   str = null;
/* 863 */                                   oI11ol.I00000oOI(str);
/* 866 */                                   throw th;
                                        }
                                    } else {
/* 446 */                               oI11ol2 = oI11ol;
/* 448 */                               str4 = str2;
/* 449 */                               o11iIIOO01i0 = o11iIIOO01i02;
/* 450 */                               str5 = str3;
/* 452 */                               iO1loOo1o2 = iO1loOo1o;
/* 453 */                               i2 = i;
/* 454 */                               i3 = 0;
/* 430 */                               str6 = str4;
/* 431 */                               String str222 = str5;
/* 432 */                               str7 = id;
/* 433 */                               OI11ol oI11ol82 = oI11ol2;
/* 456 */                               if (str6 != null) {
                                        }
                                    }
                                } catch (Throwable th10) {
/* 442 */                           th = th10;
/* 439 */                           str = null;
/* 863 */                           oI11ol.I00000oOI(str);
/* 866 */                           throw th;
                                }
                            }
/* 847 */                   return ii0111o;
/* 872 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 185 */                   int i21 = o11iIIOO01i02.I00io1l;
/* 187 */                   String str24 = o11iIIOO01i02.I00ilO0;
/* 191 */                   iO1loOo1o = (IO1loOo1o) o11iIIOO01i02.I00ilI0I1;
/* 195 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) o11iIIOO01i02.I00iio;
/* 199 */                   O11iO00I1o o11iO00I1o5 = (O11iO00I1o) o11iIIOO01i02.I00iiO;
/* 201 */                   OI11ol oI11ol9 = o11iIIOO01i02.I00iiI;
/* 203 */                   String str25 = o11iIIOO01i02.I00iOIl;
/* 205 */                   lIoii1l01l0i.I00000oOI(obj);
/* 210 */                   i = i21;
/* 211 */                   str3 = str24;
/* 212 */                   oI11ol = oI11ol9;
/* 213 */                   str2 = str25;
/* 217 */                   o1oIOiI11o0 = o1oIOiI11o03;
/* 218 */                   o11iO00I1o = o11iO00I1o5;
/* 342 */                   id = o11iO00I1o.I0001Ioi1lo;
/* 344 */                   if (id != null) {
                            }
                            break;
                        case 2:
/* 147 */                   int i22 = o11iIIOO01i02.I00ioIO;
/* 149 */                   i4 = o11iIIOO01i02.I00io1l;
/* 153 */                   String str26 = (String) o11iIIOO01i02.I00ilI0I1;
/* 157 */                   iO1loOo1o3 = (IO1loOo1o) o11iIIOO01i02.I00iio;
/* 161 */                   o11iO00I1o2 = (O11iO00I1o) o11iIIOO01i02.I00iiO;
/* 163 */                   OI11ol oI11ol10 = o11iIIOO01i02.I00iiI;
/* 165 */                   String str27 = o11iIIOO01i02.I00iOIl;
                            try {
/* 167 */                       lIoii1l01l0i.I00000oOI(obj);
/* 170 */                       oI11ol2 = oI11ol10;
/* 172 */                       i5 = i22;
/* 174 */                       str4 = str27;
/* 175 */                       o11iIIOO01i0 = o11iIIOO01i02;
/* 176 */                       str5 = str26;
/* 177 */                       objI00000oIO = obj;
/* 411 */                       Conversation conversation2 = (Conversation) objI00000oIO;
/* 417 */                       o11iO00I1o2.I0001Ioi1lo = conversation2.getId();
/* 419 */                       conversation2.getId();
/* 422 */                       id = conversation2.getId();
/* 426 */                       iO1loOo1o2 = iO1loOo1o3;
/* 427 */                       i3 = i5;
/* 429 */                       i2 = i4;
/* 430 */                       str6 = str4;
/* 431 */                       String str2222 = str5;
/* 432 */                       str7 = id;
/* 433 */                       OI11ol oI11ol822 = oI11ol2;
/* 456 */                       if (str6 != null) {
                                }
                            } catch (Throwable th11) {
/* 181 */                       th = th11;
/* 182 */                       oI11ol = oI11ol10;
/* 44 */                        str = null;
/* 863 */                       oI11ol.I00000oOI(str);
/* 866 */                       throw th;
                            }
                            break;
                        case 3:
/* 113 */                   i11 = o11iIIOO01i02.I00ioIO;
/* 115 */                   i10 = o11iIIOO01i02.I00io1l;
/* 120 */                   str11 = (String) o11iIIOO01i02.I00ilI0I1;
/* 125 */                   str8 = (String) o11iIIOO01i02.I00iio;
/* 130 */                   iO1loOo1o4 = (IO1loOo1o) o11iIIOO01i02.I00iiO;
/* 132 */                   oI11ol5 = o11iIIOO01i02.I00iiI;
                            try {
/* 134 */                       lIoii1l01l0i.I00000oOI(obj);
/* 137 */                       str = null;
/* 519 */                       IO1loOo1o iO1loOo1o92 = iO1loOo1o4;
/* 521 */                       i7 = i11;
/* 522 */                       iO1loOo1o2 = iO1loOo1o92;
/* 524 */                       String str232 = str11;
/* 526 */                       i6 = i10;
/* 527 */                       oI11ol3 = oI11ol5;
/* 528 */                       str7 = str232;
                            } catch (Exception e8) {
/* 140 */                       e = e8;
/* 141 */                       i9 = i11;
/* 143 */                       oI11ol = oI11ol5;
/* 144 */                       str = null;
/* 585 */                       Log.e("AGLlmChatViewModel", "Failed to save image message", e);
/* 588 */                       str7 = str11;
/* 589 */                       i6 = i10;
/* 590 */                       oI11ol3 = oI11ol;
/* 591 */                       iO1loOo1o2 = iO1loOo1o4;
/* 592 */                       i7 = i9;
/* 645 */                       string = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str8), "\u0000", "")).replaceAll("")).toString();
/* 649 */                       o11iIIOO01i02.I00iOIl = str;
/* 651 */                       o11iIIOO01i02.I00iiI = oI11ol3;
/* 653 */                       o11iIIOO01i02.I00iiO = iO1loOo1o2;
/* 655 */                       o11iIIOO01i02.I00iio = str8;
/* 657 */                       o11iIIOO01i02.I00ilI0I1 = str7;
/* 659 */                       o11iIIOO01i02.I00ilO0 = str;
/* 661 */                       o11iIIOO01i02.I00io1l = i6;
/* 663 */                       o11iIIOO01i02.I00ioIO = i7;
/* 666 */                       o11iIIOO01i02.I00l0I0l0lO1 = 4;
/* 668 */                       oI11ol4 = oI11ol3;
/* 670 */                       i13 = i7;
/* 672 */                       str13 = str7;
/* 675 */                       str12 = str8;
/* 681 */                       i12 = i6;
/* 688 */                       if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str13, "user", string, 0L, null, o11iIIOO01i02, 56) != ii0111o) {
                                }
/* 847 */                       return ii0111o;
                            }
/* 645 */                   string = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str8), "\u0000", "")).replaceAll("")).toString();
/* 649 */                   o11iIIOO01i02.I00iOIl = str;
/* 651 */                   o11iIIOO01i02.I00iiI = oI11ol3;
/* 653 */                   o11iIIOO01i02.I00iiO = iO1loOo1o2;
/* 655 */                   o11iIIOO01i02.I00iio = str8;
/* 657 */                   o11iIIOO01i02.I00ilI0I1 = str7;
/* 659 */                   o11iIIOO01i02.I00ilO0 = str;
/* 661 */                   o11iIIOO01i02.I00io1l = i6;
/* 663 */                   o11iIIOO01i02.I00ioIO = i7;
/* 666 */                   o11iIIOO01i02.I00l0I0l0lO1 = 4;
/* 668 */                   oI11ol4 = oI11ol3;
/* 670 */                   i13 = i7;
/* 672 */                   str13 = str7;
/* 675 */                   str12 = str8;
/* 681 */                   i12 = i6;
/* 688 */                   if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str13, "user", string, 0L, null, o11iIIOO01i02, 56) != ii0111o) {
                            }
/* 847 */                   return ii0111o;
                        case 4:
/* 79 */                    i15 = o11iIIOO01i02.I00ioIO;
/* 81 */                    i14 = o11iIIOO01i02.I00io1l;
/* 86 */                    str14 = (String) o11iIIOO01i02.I00ilI0I1;
/* 91 */                    str8 = (String) o11iIIOO01i02.I00iio;
/* 96 */                    iO1loOo1o5 = (IO1loOo1o) o11iIIOO01i02.I00iiO;
/* 98 */                    oI11ol6 = o11iIIOO01i02.I00iiI;
                            try {
/* 100 */                       lIoii1l01l0i.I00000oOI(obj);
/* 103 */                       str = null;
                            } catch (SQLiteConstraintException e9) {
/* 109 */                       e = e9;
/* 110 */                       str = null;
/* 741 */                       Log.w("AGLlmChatViewModel", "Foreign key constraint failed, conversation might not be committed yet. Retrying...", e);
/* 744 */                       o11iIIOO01i02.I00iOIl = str;
/* 746 */                       o11iIIOO01i02.I00iiI = oI11ol6;
/* 748 */                       o11iIIOO01i02.I00iiO = iO1loOo1o5;
/* 750 */                       o11iIIOO01i02.I00iio = str8;
/* 752 */                       o11iIIOO01i02.I00ilI0I1 = str14;
/* 754 */                       o11iIIOO01i02.I00ilO0 = str;
/* 756 */                       o11iIIOO01i02.I00io1l = i14;
/* 758 */                       o11iIIOO01i02.I00ioIO = i15;
/* 761 */                       o11iIIOO01i02.I00l0I0l0lO1 = 5;
/* 11 */                        str15 = "";
/* 770 */                       if (il0l1o1l.I00000oOI(100L, o11iIIOO01i02) != ii0111o) {
                                }
/* 847 */                       return ii0111o;
                            }
/* 851 */                   oI11ol6.I00000oOI(str);
/* 872 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 47 */                    i16 = o11iIIOO01i02.I00ioIO;
/* 49 */                    i17 = o11iIIOO01i02.I00io1l;
/* 57 */                    str16 = (String) o11iIIOO01i02.I00ilI0I1;
/* 61 */                    str17 = (String) o11iIIOO01i02.I00iio;
/* 65 */                    iO1loOo1o6 = (IO1loOo1o) o11iIIOO01i02.I00iiO;
/* 67 */                    OI11ol oI11ol11 = o11iIIOO01i02.I00iiI;
                            try {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
/* 72 */                        oI11ol7 = oI11ol11;
/* 11 */                        str15 = "";
/* 807 */                       string2 = OlOoOIi0o.I00OIo(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]").matcher(OlOolloIIOl0.I000iOII(OlOoOIi0o.I00OIl(Barcode.FORMAT_AZTEC, str17), "\u0000", str15)).replaceAll(str15)).toString();
/* 812 */                       o11iIIOO01i02.I00iOIl = null;
/* 814 */                       o11iIIOO01i02.I00iiI = oI11ol7;
/* 816 */                       o11iIIOO01i02.I00iiO = str16;
/* 818 */                       o11iIIOO01i02.I00iio = null;
/* 820 */                       o11iIIOO01i02.I00ilI0I1 = null;
/* 822 */                       o11iIIOO01i02.I00ilO0 = null;
/* 824 */                       o11iIIOO01i02.I00io1l = i17;
/* 826 */                       o11iIIOO01i02.I00ioIO = i16;
/* 829 */                       o11iIIOO01i02.I00l0I0l0lO1 = 6;
/* 845 */                       if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o6, str16, "user", string2, 0L, null, this, 56) != ii0111o) {
/* 848 */                           oI11ol = oI11ol7;
/* 849 */                           oI11ol6 = oI11ol;
/* 850 */                           str = null;
/* 851 */                           oI11ol6.I00000oOI(str);
/* 872 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 847 */                       return ii0111o;
                            } catch (Throwable th12) {
/* 76 */                        th = th12;
/* 77 */                        oI11ol = oI11ol11;
/* 44 */                        str = null;
/* 863 */                       oI11ol.I00000oOI(str);
/* 866 */                       throw th;
                            }
                        case 6:
/* 36 */                    oI11ol = o11iIIOO01i02.I00iiI;
                            try {
/* 38 */                        lIoii1l01l0i.I00000oOI(obj);
/* 849 */                       oI11ol6 = oI11ol;
/* 850 */                       str = null;
/* 851 */                       oI11ol6.I00000oOI(str);
/* 872 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th13) {
/* 43 */                        th = th13;
/* 44 */                        str = null;
/* 863 */                       oI11ol.I00000oOI(str);
/* 866 */                       throw th;
                            }
                        default:
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                    return null;
                    }
                }
            }
