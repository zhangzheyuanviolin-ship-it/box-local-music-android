            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.SparseBooleanArray;
            import android.util.SparseLongArray;
            import android.view.GestureDetector;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityManager;
            import android.view.autofill.AutofillId;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.Reference;
            import java.lang.ref.ReferenceQueue;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class i01l1I {
                public static final ViewGroup.LayoutParams I00000oIO = new ViewGroup.LayoutParams(-2, -2);

                /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x07c0  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x07c9  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x07db  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x07e0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final i01l0IiO I00000oIO(I0100o111I i0100o111I, IOl10lI1 iOl10lI1, IOii1l iOii1l) {
                    I0lio1O01i01 i0lio1O01i01;
                    i01l0IiO i01l0iio;
/* 7 */             short s = 0;
/* 13 */            int i = 17;
/* 18 */            if (Io0O0Ol.I00000oIO.compareAndSet(false, true)) {
/* 20 */                IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(1, null, null, 6);
/* 41 */                iOi1II01i0.I0000O(il001oo1.I00000oIO((Ii00l101O) I101OO01.I00ll1.getValue()), null, null, new IiI110i1O(iiiii1oi1I00000oIO, null), 3);
/* 46 */                Iil1olo iil1olo = new Iil1olo(i);
/* 49 */                iil1olo.I00iiI = iiiii1oi1I00000oIO;
/* 51 */                VarHandle.storeStoreFence();
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 65 */                    Ol1l1lI1Ili.I000OOo1O = IOOi0Ool1i.I00OI1(Ol1l1lI1Ili.I000OOo1O, iil1olo);
                        }
/* 68 */                Ol1l1lI1Ili.I0000Il00O();
                    }
/* 79 */            if (i0100o111I.getChildCount() > 0) {
/* 81 */                View childAt = i0100o111I.getChildAt(0);
/* 87 */                if (childAt instanceof I0lio1O01i01) {
/* 89 */                    i0lio1O01i01 = (I0lio1O01i01) childAt;
                        }
/* 98 */                if (i0lio1O01i01 == null) {
/* 102 */                   Context context = i0100o111I.getContext();
/* 108 */                   I0lio1O01i01 i0lio1O01i012 = new I0lio1O01i01(context);
/* 111 */                   i0lio1O01i012.I00iOIl = iOl10lI1;
/* 118 */                   i0lio1O01i012.I00iiI = 9205357640488583168L;
/* 120 */                   i0lio1O01i012.I00iiO = true;
/* 124 */                   i0lio1O01i012.I00ioIO = o0iOli.I00iio;
/* 131 */                   i0lio1O01i012.I00l0I0l0lO1 = new I1Il0loi();
/* 135 */                   I0li0Io i0li0Io = new I0li0Io(s);
/* 138 */                   i0li0Io.I00iiI = i0lio1O01i012;
/* 140 */                   VarHandle.storeStoreFence();
/* 143 */                   i0lio1O01i012.I00l0OO0IO = i0li0Io;
/* 156 */                   i0lio1O01i012.I00li1OI = new OIooliIO0(iOIl1O.I00000oIO(context), IOO0o0I1l.I00ilI0I1);
/* 160 */                   Ili1ioOlo0oO ili1ioOlo0oO = new Ili1ioOlo0oO();
/* 163 */                   ili1ioOlo0oO.I00000oIO = i0lio1O01i012;
/* 165 */                   ili1ioOlo0oO.I00000oOI = i0lio1O01i012;
/* 169 */                   int i2 = 2;
/* 175 */                   ili1ioOlo0oO.I0000Il00O = new IliIO10oO0(2, null, 14);
/* 179 */                   Ili1O0oO00o ili1O0oO00o = new Ili1O0oO00o();
/* 182 */                   ili1O0oO00o.I00000oIO = ili1ioOlo0oO;
/* 184 */                   ili1O0oO00o.I00000oOI = i0lio1O01i012;
/* 186 */                   OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 193 */                   ili1O0oO00o.I0000Il00O = new OI10IIO();
/* 200 */                   ili1O0oO00o.I0000O = new OI10IIO();
/* 202 */                   VarHandle.storeStoreFence();
/* 205 */                   ili1ioOlo0oO.I0000O = ili1O0oO00o;
/* 209 */                   Ili1io1Il ili1io1Il = new Ili1io1Il();
/* 212 */                   ili1io1Il.I00000oIO = ili1ioOlo0oO;
/* 214 */                   VarHandle.storeStoreFence();
/* 217 */                   ili1ioOlo0oO.I0000oI00 = ili1io1Il;
/* 224 */                   ili1ioOlo0oO.I000II = new OI0oiiIO0(1);
/* 226 */                   VarHandle.storeStoreFence();
/* 229 */                   i0lio1O01i012.I00lli11 = ili1ioOlo0oO;
/* 231 */                   iOl10lI1.I0000oI00();
/* 240 */                   i0lio1O01i012.I00lll10 = iOl10lI1.I0000Il00O.I000iOII();
/* 244 */                   I0o11ooo00l1 i0o11ooo00l1 = new I0o11ooo00l1();
/* 249 */                   IilI0O iilI0O = new IilI0O();
/* 254 */                   iilI0O.I00o0iI0io1 = i1i0olI.I00iio;
/* 258 */                   iilI0O.I00oI0i = 0L;
/* 260 */                   VarHandle.storeStoreFence();
/* 263 */                   i0o11ooo00l1.I00000oIO = iilI0O;
/* 270 */                   i0o11ooo00l1.I00000oOI = new I1Io1oIoo(0);
/* 274 */                   I0o10ll1O i0o10ll1O = new I0o10ll1O();
/* 277 */                   i0o10ll1O.I00000oIO = i0o11ooo00l1;
/* 279 */                   VarHandle.storeStoreFence();
/* 282 */                   i0o11ooo00l1.I0000Il00O = i0o10ll1O;
/* 284 */                   VarHandle.storeStoreFence();
/* 287 */                   i0lio1O01i012.I00o0iI0io1 = i0o11ooo00l1;
/* 289 */                   Boolean bool = Boolean.FALSE;
/* 295 */                   i0lio1O01i012.I00o0l1o1o0 = lOO00IiI0li.I00000oIO(bool);
/* 299 */                   I0lOo0io i0lOo0io = new I0lOo0io(i2);
/* 302 */                   i0lOo0io.I00iiI = i0lio1O01i012;
/* 304 */                   VarHandle.storeStoreFence();
/* 311 */                   i0lio1O01i012.I00o101lO = Ol1llolil.I00000oOI(i0lOo0io);
/* 315 */                   Ioo0oO1 ioo0oO1 = new Ioo0oO1(1);
/* 322 */                   OI10I1IoI0Ol oI10I1IoI0Ol = new OI10I1IoI0Ol(9);
/* 327 */                   i00li00iOi.I00000oIO.getClass();
/* 339 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I00000oOI, new i010O0loi1l("caption bar"));
/* 351 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I0000Il00O, new i010O0loi1l("display cutout"));
/* 363 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I0000O, new i010O0loi1l("ime"));
/* 375 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I0000oI00, new i010O0loi1l("mandatory system gestures"));
/* 387 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I0001Ioi1lo, new i010O0loi1l("navigation bars"));
/* 399 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I000II, new i010O0loi1l("status bars"));
/* 411 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I000O01llI0, new i010O0loi1l("system gestures"));
/* 423 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I000OOo1O, new i010O0loi1l("tappable element"));
/* 435 */                   oI10I1IoI0Ol.I000lI(i00lO010I.I000OiO, new i010O0loi1l("waterfall"));
/* 438 */                   ioo0oO1.I00ilI0I1 = oI10I1IoI0Ol;
/* 445 */                   ioo0oO1.I00ilO0 = new OIooi1iOiOol(0);
/* 453 */                   ioo0oO1.I00io1l = new OI0oiiIO0(4);
/* 460 */                   ioo0oO1.I00ioIO = new Ol1o0O0O0();
/* 462 */                   VarHandle.storeStoreFence();
/* 465 */                   i0lio1O01i012.I00oI0i = ioo0oO1;
/* 469 */                   O0iiOioolIi o0iiOioolIi = new O0iiOioolIi(3);
/* 474 */                   o0iiOioolIi.I00i0oil(Oi1ol01i.I0000Il00O);
/* 481 */                   o0iiOioolIi.I00i01iIIliI(i0lio1O01i012.getDensity());
/* 488 */                   o0iiOioolIi.I00iIi0i1o(i0lio1O01i012.getViewConfiguration());
/* 493 */                   I0lilIOO i0lilIOO = new I0lilIOO();
/* 496 */                   i0lilIOO.I00000oIO = i0lio1O01i012;
/* 498 */                   VarHandle.storeStoreFence();
/* 523 */                   o0iiOioolIi.I00iIO(i0lilIOO.I0000O(((Ili1ioOlo0oO) i0lio1O01i012.getFocusOwner()).I0000oI00).I0000O(i0lio1O01i012.m27getDragAndDropManager().I0000Il00O));
/* 526 */                   i0lio1O01i012.I00oII = o0iiOioolIi;
/* 528 */                   OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 535 */                   i0lio1O01i012.I00oIiI10 = new OI0l1oli1I();
/* 539 */                   OI0l1oli1I layoutNodes = i0lio1O01i012.getLayoutNodes();
/* 543 */                   OOo0Olol0o oOo0Olol0o = new OOo0Olol0o();
/* 546 */                   oOo0Olol0o.I00000oIO = layoutNodes;
/* 548 */                   oOo0Olol0o.I00000oOI = i0lio1O01i012;
/* 554 */                   I00Ol00 i00Ol00 = new I00Ol00(10, s);
/* 561 */                   i00Ol00.I0000Il00O = new long[192];
/* 565 */                   i00Ol00.I0000O = new long[192];
/* 567 */                   oOo0Olol0o.I0000Il00O = i00Ol00;
/* 571 */                   Oo10ili0oo0 oo10ili0oo0 = new Oo10ili0oo0();
/* 579 */                   oo10ili0oo0.I00000oIO = new OI0l1oli1I();
/* 583 */                   oo10ili0oo0.I0000Il00O = -1L;
/* 585 */                   oo10ili0oo0.I0000O = 0L;
/* 587 */                   oo10ili0oo0.I0000oI00 = 0L;
/* 589 */                   VarHandle.storeStoreFence();
/* 592 */                   oOo0Olol0o.I0000O = oo10ili0oo0;
/* 599 */                   oOo0Olol0o.I0000oI00 = new OI0oiiIO0();
/* 601 */                   oOo0Olol0o.I000OiO = -1L;
/* 607 */                   OIOo1iiI oIOo1iiI = new OIOo1iiI(13);
/* 610 */                   oIOo1iiI.I00iiI = oOo0Olol0o;
/* 612 */                   VarHandle.storeStoreFence();
/* 615 */                   oOo0Olol0o.I000iOII = oIOo1iiI;
/* 622 */                   oOo0Olol0o.I000l1 = new II1i0i0ilO();
/* 624 */                   VarHandle.storeStoreFence();
/* 627 */                   i0lio1O01i012.I00oO101o = oOo0Olol0o;
/* 631 */                   O0iiOioolIi root = i0lio1O01i012.getRoot();
/* 637 */                   Il01lIO il01lIO = new Il01lIO();
/* 640 */                   OI0l1oli1I layoutNodes2 = i0lio1O01i012.getLayoutNodes();
/* 644 */                   Oil01I0 oil01I0 = new Oil01I0();
/* 647 */                   oil01I0.I00000oIO = root;
/* 649 */                   oil01I0.I00000oOI = il01lIO;
/* 651 */                   oil01I0.I0000Il00O = layoutNodes2;
/* 658 */                   oil01I0.I0000O = new OI0oiiIO0(2);
/* 660 */                   VarHandle.storeStoreFence();
/* 663 */                   i0lio1O01i012.I00oOio10iI1 = oil01I0;
/* 667 */                   I0ll1oo i0ll1oo = new I0ll1oo();
/* 670 */                   i0ll1oo.I00iio = i0lio1O01i012;
/* 674 */                   i0ll1oo.I00ilI0I1 = Integer.MIN_VALUE;
/* 678 */                   I0liooi i0liooi = new I0liooi(s);
/* 681 */                   i0liooi.I00iiI = i0ll1oo;
/* 683 */                   VarHandle.storeStoreFence();
/* 686 */                   i0ll1oo.I00ilO0 = i0liooi;
/* 700 */                   i0ll1oo.I00io1l = (AccessibilityManager) i0lio1O01i012.getContext().getSystemService("accessibility");
/* 704 */                   i0ll1oo.I00ioIO = 100L;
/* 712 */                   new Handler(Looper.getMainLooper());
/* 717 */                   I0ll0IlI1lo i0ll0IlI1lo = new I0ll0IlI1lo(2);
/* 720 */                   i0ll0IlI1lo.I00ilI0I1 = i0ll1oo;
/* 724 */                   I01oIilIolOl i01oIilIolOl = new I01oIilIolOl();
/* 727 */                   i01oIilIolOl.I00000oIO = i0ll0IlI1lo;
/* 729 */                   VarHandle.storeStoreFence();
/* 732 */                   i0ll0IlI1lo.I00iiI = i01oIilIolOl;
/* 734 */                   VarHandle.storeStoreFence();
/* 737 */                   i0ll1oo.I00l0OO0IO = i0ll0IlI1lo;
/* 739 */                   i0ll1oo.I00li1OI = Integer.MIN_VALUE;
/* 741 */                   i0ll1oo.I00ll1 = Integer.MIN_VALUE;
/* 748 */                   i0ll1oo.I00o0l1o1o0 = new OI0l1oli1I();
/* 755 */                   i0ll1oo.I00o101lO = new OI0l1oli1I();
/* 762 */                   i0ll1oo.I00oI0i = new OlIIioolI(0);
/* 769 */                   i0ll1oo.I00oII = new OlIIioolI(0);
/* 772 */                   i0ll1oo.I00oIiI10 = -1;
/* 779 */                   i0ll1oo.I00oOio10iI1 = new I1Io1oIoo(0);
/* 786 */                   i0ll1oo.I00ol1 = iOl1iOi0I.I00000oIO(1, null, null, 6);
/* 788 */                   i0ll1oo.I00olI = true;
/* 790 */                   OI0l1oli1I oI0l1oli1I2 = IooO001.I00000oIO;
/* 792 */                   i0ll1oo.I00oliIiO01i = oI0l1oli1I2;
/* 799 */                   i0ll1oo.I00oo1iO0ll = new OI0lOIOi1l();
/* 806 */                   i0ll1oo.I00ooIo0 = new OI0l1iIo1();
/* 813 */                   i0ll1oo.I00ooiO1I = new OI0l1iIo1();
/* 817 */                   i0ll1oo.I00oooO = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
/* 821 */                   i0ll1oo.I0100i = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
/* 826 */                   OlilOlOiI olilOlOiI = new OlilOlOiI(4);
/* 834 */                   olilOlOiI.I00iiI = new WeakHashMap();
/* 841 */                   olilOlOiI.I00iiO = new WeakHashMap();
/* 848 */                   olilOlOiI.I00iio = new WeakHashMap();
/* 850 */                   VarHandle.storeStoreFence();
/* 853 */                   i0ll1oo.I0100o111I = olilOlOiI;
/* 860 */                   i0ll1oo.I010101Oo1lO = new OI0l1oli1I();
/* 875 */                   i0ll1oo.I010I0 = new Oil000oIIO(i0lio1O01i012.getSemanticsOwner().I00000oIO(), oI0l1oli1I2);
/* 877 */                   int i3 = IooIiIo.I00000oIO;
/* 884 */                   i0ll1oo.I010OIo1l = new OI0l1iIo1();
/* 886 */                   i0lio1O01i012.addOnAttachStateChangeListener(i0ll1oo);
/* 891 */                   I0100i i0100i = new I0100i(i2);
/* 894 */                   i0100i.I00iiI = i0ll1oo;
/* 896 */                   VarHandle.storeStoreFence();
/* 899 */                   i0ll1oo.I010i10l = i0100i;
/* 906 */                   i0ll1oo.I010iIIOlo = new ArrayList();
/* 911 */                   I0liooi i0liooi2 = new I0liooi(1);
/* 914 */                   i0liooi2.I00iiI = i0ll1oo;
/* 916 */                   VarHandle.storeStoreFence();
/* 919 */                   i0ll1oo.I010ioo = i0liooi2;
/* 921 */                   VarHandle.storeStoreFence();
/* 924 */                   i0lio1O01i012.I00ol1 = i0ll1oo;
/* 959 */                   I0lii0I00 i0lii0I00 = new I0lii0I00(0, i0lio1O01i012, I0lllI01iooo.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0);
/* 962 */                   I0lo1oIo i0lo1oIo = new I0lo1oIo();
/* 965 */                   i0lo1oIo.I00iOIl = i0lio1O01i012;
/* 967 */                   i0lo1oIo.I00iiI = i0lii0I00;
/* 974 */                   i0lo1oIo.I00iio = new ArrayList();
/* 976 */                   i0lo1oIo.I00ilI0I1 = 100L;
/* 980 */                   i0lo1oIo.I00ilO0 = I0lo0olOoii1.I00iOIl;
/* 983 */                   i0lo1oIo.I00io1l = true;
/* 989 */                   i0lo1oIo.I00ioIO = iOl1iOi0I.I00000oIO(1, null, null, 6);
/* 997 */                   new Handler(Looper.getMainLooper());
/* 1000 */                  i0lo1oIo.I00l0I0l0lO1 = oI0l1oli1I2;
/* 1007 */                  i0lo1oIo.I00li1OI = new OI0l1oli1I();
/* 1022 */                  i0lo1oIo.I00ll1 = new Oil000oIIO(i0lio1O01i012.getSemanticsOwner().I00000oIO(), oI0l1oli1I2);
/* 1027 */                  I0100i i0100i2 = new I0100i(3);
/* 1030 */                  i0100i2.I00iiI = i0lo1oIo;
/* 1032 */                  VarHandle.storeStoreFence();
/* 1035 */                  i0lo1oIo.I00lll10 = i0100i2;
/* 1037 */                  VarHandle.storeStoreFence();
/* 1040 */                  i0lio1O01i012.I00olI = i0lo1oIo;
/* 1044 */                  I0oIoiI0 i0oIoiI0 = new I0oIoiI0();
/* 1047 */                  i0oIoiI0.I00000oIO = i0lio1O01i012;
/* 1054 */                  i0oIoiI0.I00000oOI = new Object();
/* 1058 */                  I0oIl0OolO i0oIl0OolO = new I0oIl0OolO();
/* 1061 */                  i0oIl0OolO.I00iOIl = i0oIoiI0;
/* 1063 */                  VarHandle.storeStoreFence();
/* 1066 */                  i0oIoiI0.I0000oI00 = i0oIl0OolO;
/* 1072 */                  if (i0lio1O01i012.isAttachedToWindow()) {
/* 1074 */                      Context context2 = i0lio1O01i012.getContext();
/* 1080 */                      if (!i0oIoiI0.I0000Il00O) {
/* 1086 */                          context2.getApplicationContext().registerComponentCallbacks(i0oIl0OolO);
/* 1090 */                          i0oIoiI0.I0000Il00O = true;
                                }
                            }
/* 1095 */                  I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(0);
/* 1098 */                  i0oIl0io0II1.I00iiI = i0oIoiI0;
/* 1100 */                  VarHandle.storeStoreFence();
/* 1103 */                  i0lio1O01i012.addOnAttachStateChangeListener(i0oIl0io0II1);
/* 1106 */                  VarHandle.storeStoreFence();
/* 1109 */                  i0lio1O01i012.I00oli = i0oIoiI0;
/* 1113 */                  I1lOlO0ioIl0 i1lOlO0ioIl0 = new I1lOlO0ioIl0();
/* 1121 */                  i1lOlO0ioIl0.I00000oIO = new LinkedHashMap();
/* 1123 */                  VarHandle.storeStoreFence();
/* 1126 */                  i0lio1O01i012.I00oliIiO01i = i1lOlO0ioIl0;
/* 1133 */                  i0lio1O01i012.I00oo1iO0ll = new OI0oiiIO0();
/* 1137 */                  OI01OO oi01oo = new OI01OO();
/* 1145 */                  oi01oo.I00000oOI = new SparseLongArray();
/* 1152 */                  oi01oo.I0000Il00O = new SparseBooleanArray();
/* 1159 */                  oi01oo.I0000O = new ArrayList();
/* 1166 */                  oi01oo.I0000oI00 = new O1IOillioo0I((Object) null);
/* 1169 */                  oi01oo.I0001Ioi1lo = -1;
/* 1171 */                  oi01oo.I000II = -1;
/* 1173 */                  VarHandle.storeStoreFence();
/* 1176 */                  i0lio1O01i012.I0100i = oi01oo;
/* 1180 */                  O0iiOioolIi root2 = i0lio1O01i012.getRoot();
/* 1184 */                  IOI0oloi01 iOI0oloi01 = new IOI0oloi01();
/* 1187 */                  iOI0oloi01.I00000oOI = root2;
/* 1195 */                  Iollol0oI iollol0oI = (Iollol0oI) root2.I010101Oo1lO.I00iio;
/* 1197 */                  Io1ioiI1 io1ioiI1 = new Io1ioiI1();
/* 1200 */                  io1ioiI1.I00000oIO = iollol0oI;
/* 1207 */                  io1ioiI1.I0001Ioi1lo = new OI0oiiIO0();
/* 1214 */                  io1ioiI1.I000II = new OIIlloOIoOo();
/* 1223 */                  io1ioiI1.I000O01llI0 = new OI0lli1(10);
/* 1225 */                  VarHandle.storeStoreFence();
/* 1228 */                  iOI0oloi01.I0000Il00O = io1ioiI1;
/* 1235 */                  Oi0Oooi oi0Oooi = new Oi0Oooi(16, false);
/* 1243 */                  oi0Oooi.I00iiI = new O1IOillioo0I((Object) null);
/* 1245 */                  VarHandle.storeStoreFence();
/* 1248 */                  iOI0oloi01.I0000O = oi0Oooi;
/* 1255 */                  iOI0oloi01.I0000oI00 = new Io1l0iI11iII();
/* 1257 */                  VarHandle.storeStoreFence();
/* 1260 */                  i0lio1O01i012.I0100o111I = iOI0oloi01;
/* 1279 */                  i0lio1O01i012.I010101Oo1lO = lOO00IiI0li.I00000oIO(new Configuration(context.getResources().getConfiguration()));
/* 1284 */                  I0lOo0io i0lOo0io2 = new I0lOo0io(3);
/* 1287 */                  i0lOo0io2.I00iiI = i0lio1O01i012;
/* 1289 */                  VarHandle.storeStoreFence();
/* 1296 */                  i0lio1O01i012.I010I0 = Ol1llolil.I00000oOI(i0lOo0io2);
/* 1300 */                  I1lOlO0ioIl0 autofillTree = i0lio1O01i012.getAutofillTree();
/* 1304 */                  I0lI1I10iIII i0lI1I10iIII = new I0lI1I10iIII();
/* 1307 */                  i0lI1I10iIII.I00000oIO = i0lio1O01i012;
/* 1309 */                  i0lI1I10iIII.I00000oOI = autofillTree;
/* 1312 */                  i0lio1O01i012.setImportantForAutofill(1);
/* 1321 */                  AutofillId autofillId = (AutofillId) li1iI1ill1.I00000oIO(i0lio1O01i012).I00iiI;
/* 1323 */                  if (autofillId == null) {
/* 1978 */                      throw IIlIOloOOO.I000OOo1O("Required value was null.");
                            }
/* 1325 */                  i0lI1I10iIII.I0000Il00O = autofillId;
/* 1327 */                  VarHandle.storeStoreFence();
/* 1330 */                  i0lio1O01i012.I010II = i0lI1I10iIII;
/* 1338 */                  IIlio101Io iIlio101Io = new IIlio101Io(21);
/* 1341 */                  iIlio101Io.I00iiI = context;
/* 1343 */                  VarHandle.storeStoreFence();
/* 1346 */                  Oil01I0 semanticsOwner = i0lio1O01i012.getSemanticsOwner();
/* 1350 */                  OOo0Olol0o rectManager = i0lio1O01i012.getRectManager();
/* 1354 */                  String packageName = context.getPackageName();
/* 1358 */                  I0lII0loi i0lII0loi = new I0lII0loi();
/* 1361 */                  i0lII0loi.I00iOIl = iIlio101Io;
/* 1363 */                  i0lII0loi.I00iiI = semanticsOwner;
/* 1365 */                  i0lII0loi.I00iiO = i0lio1O01i012;
/* 1367 */                  i0lII0loi.I00iio = rectManager;
/* 1369 */                  i0lII0loi.I00ilI0I1 = packageName;
/* 1376 */                  i0lII0loi.I00ilO0 = new Rect();
/* 1379 */                  i0lio1O01i012.setImportantForAutofill(1);
/* 1388 */                  AutofillId autofillId2 = (AutofillId) li1iI1ill1.I00000oIO(i0lio1O01i012).I00iiI;
/* 1390 */                  if (autofillId2 == null) {
/* 1973 */                      throw IIlIOloOOO.I000OOo1O("Required value was null.");
                            }
/* 1392 */                  i0lII0loi.I00io1l = autofillId2;
/* 1399 */                  i0lII0loi.I00ioIO = new OI0lOIOi1l();
/* 1401 */                  VarHandle.storeStoreFence();
/* 1404 */                  i0lio1O01i012.I010OIo1l = i0lII0loi;
/* 1411 */                  I0lOl1 i0lOl1 = new I0lOl1(1);
/* 1414 */                  i0lOl1.I00iiI = i0lio1O01i012;
/* 1416 */                  VarHandle.storeStoreFence();
/* 1419 */                  OIlOIi0 oIlOIi0 = new OIlOIi0();
/* 1427 */                  oIlOIi0.I00000oIO = new Ol1olI0o1I01(i0lOl1);
/* 1436 */                  oIlOIi0.I00000oOI = new OI1lOo(13);
/* 1445 */                  oIlOIi0.I0000Il00O = new OI1lOo(14);
/* 1454 */                  oIlOIi0.I0000O = new OI1lOo(15);
/* 1461 */                  oIlOIi0.I0000oI00 = new OI1lOo(16);
/* 1470 */                  oIlOIi0.I0001Ioi1lo = new OI1lOo(17);
/* 1479 */                  oIlOIi0.I000II = new OI1lOo(18);
/* 1488 */                  oIlOIi0.I000O01llI0 = new OI1lOo(19);
/* 1490 */                  VarHandle.storeStoreFence();
/* 1493 */                  i0lio1O01i012.I010iIIOlo = oIlOIi0;
/* 1497 */                  O0iiOioolIi root3 = i0lio1O01i012.getRoot();
/* 1501 */                  O1iO111i o1iO111i = new O1iO111i();
/* 1504 */                  o1iO111i.I00000oIO = root3;
/* 1510 */                  IOO000ilo iOO000ilo = new IOO000ilo(12);
/* 1520 */                  iOO000ilo.I00iiI = new Oi1ol0llI(8);
/* 1527 */                  iOO000ilo.I00iiO = new Oi1ol0llI(8);
/* 1534 */                  iOO000ilo.I00iio = new Oi1ol0llI(8);
/* 1536 */                  VarHandle.storeStoreFence();
/* 1539 */                  o1iO111i.I00000oOI = iOO000ilo;
/* 1543 */                  IoloOio0I ioloOio0I = new IoloOio0I(21);
/* 1553 */                  ioloOio0I.I00iiI = new OI110O0(new O0iiOioolIi[16]);
/* 1555 */                  VarHandle.storeStoreFence();
/* 1558 */                  o1iO111i.I0000oI00 = ioloOio0I;
/* 1567 */                  o1iO111i.I0001Ioi1lo = new OI110O0(new O0iiOioolIi[16]);
/* 1571 */                  o1iO111i.I000II = 1L;
/* 1580 */                  o1iO111i.I000O01llI0 = new OI110O0(new O1iIoll1[16]);
/* 1582 */                  VarHandle.storeStoreFence();
/* 1585 */                  i0lio1O01i012.I010l1ol111 = o1iO111i;
/* 1592 */                  i0lio1O01i012.I010lI0oi = 9223372034707292159L;
/* 1599 */                  i0lio1O01i012.I010o0o0oO = new int[]{0, 0};
/* 1605 */                  i0lio1O01i012.I010oio1OO0 = O1i010l1l.I00000oOI();
/* 1612 */                  i0lio1O01i012.I01101IOlO = new Matrix();
/* 1618 */                  i0lio1O01i012.I01101olii = O1i010l1l.I00000oOI();
/* 1624 */                  i0lio1O01i012.I0110OiO = O1i010l1l.I00000oOI();
/* 1628 */                  i0lio1O01i012.I0110o = -1L;
/* 1635 */                  i0lio1O01i012.I011IO1I11OI = 9187343241974906880L;
/* 1642 */                  i0lio1O01i012.I011Ol0 = new AtomicReference(null);
/* 1646 */                  i0lio1O01i012.I011iO = iOl10lI1.I00100l0;
/* 1656 */                  int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
/* 1660 */                  int[] iArr = Ili11o0l.I00000oIO;
/* 1672 */                  O0iOOoiioO o0iOOoiioO = layoutDirection != 0 ? layoutDirection != 1 ? null : O0iOOoiioO.I00iiI : O0iOOoiioO.I00iOIl;
/* 1674 */                  if (o0iOOoiioO == null) {
/* 1676 */                      o0iOOoiioO = O0iOOoiioO.I00iOIl;
                            }
/* 1682 */                  i0lio1O01i012.I011iiii0i = lOO00IiI0li.I00000oIO(o0iOOoiioO);
/* 1686 */                  O1ooilI0 o1ooilI0 = new O1ooilI0();
/* 1689 */                  o1ooilI0.I00000oIO = i0lio1O01i012;
/* 1691 */                  VarHandle.storeStoreFence();
/* 1694 */                  i0lio1O01i012.I011lO1liO1O = o1ooilI0;
/* 1699 */                  i000IO i000io = new i000IO(0);
/* 1709 */                  i000io.I00iiI = new OI110O0(new Reference[16]);
/* 1716 */                  i000io.I00iiO = new ReferenceQueue();
/* 1718 */                  VarHandle.storeStoreFence();
/* 1721 */                  i0lio1O01i012.I01I0Iioooo0 = i000io;
/* 1728 */                  i0lio1O01i012.I01I1Oo0oll = new OI0oiiIO0();
/* 1732 */                  i0lio1O01i012.I01II10 = Float.NaN;
/* 1734 */                  i0lio1O01i012.I01IO0oio = Float.NaN;
/* 1736 */                  i0lio1O01i012.I01IO1il = Float.NaN;
/* 1738 */                  i0lio1O01i012.I01Ii0ll10O = Float.NaN;
/* 1743 */                  I0lil01 i0lil01 = new I0lil01(0);
/* 1746 */                  i0lil01.I00iiI = i0lio1O01i012;
/* 1748 */                  VarHandle.storeStoreFence();
/* 1751 */                  i0lio1O01i012.I01IiOO = i0lil01;
/* 1755 */                  int i4 = 1;
/* 1756 */                  I0li0Io i0li0Io2 = new I0li0Io(i4);
/* 1759 */                  i0li0Io2.I00iiI = i0lio1O01i012;
/* 1761 */                  VarHandle.storeStoreFence();
/* 1764 */                  i0lio1O01i012.I01Iio10lo = i0li0Io2;
/* 1768 */                  i1IIlI i1iili = new i1IIlI(i4);
/* 1771 */                  i1iili.I00iiI = i0lio1O01i012;
/* 1773 */                  VarHandle.storeStoreFence();
/* 1776 */                  i0lio1O01i012.I01Ilioliio = i1iili;
/* 1783 */                  I0lOl1 i0lOl12 = new I0lOl1(2);
/* 1786 */                  i0lOl12.I00iiI = i0lio1O01i012;
/* 1788 */                  VarHandle.storeStoreFence();
/* 1791 */                  IolIIo0o0Iio iolIIo0o0Iio = new IolIIo0o0Iio();
/* 1794 */                  iolIIo0o0Iio.I0000Il00O = i0lOl12;
/* 1797 */                  iolIIo0o0Iio.I00000oOI = 0;
/* 1803 */                  IolII0 iolII0 = new IolII0();
/* 1806 */                  iolII0.I00000oIO = iolIIo0o0Iio;
/* 1808 */                  VarHandle.storeStoreFence();
/* 1814 */                  iolIIo0o0Iio.I0000O = new GestureDetector(context, iolII0);
/* 1816 */                  VarHandle.storeStoreFence();
/* 1819 */                  i0lio1O01i012.I01Ilo0i = iolIIo0o0Iio;
/* 1824 */                  I0lOo0io i0lOo0io3 = new I0lOo0io(4);
/* 1827 */                  i0lOo0io3.I00iiI = i0lio1O01i012;
/* 1829 */                  VarHandle.storeStoreFence();
/* 1832 */                  i0lio1O01i012.I01Io000 = i0lOo0io3;
/* 1837 */                  I0lOo0io i0lOo0io4 = new I0lOo0io(0);
/* 1840 */                  i0lOo0io4.I00iiI = i0lio1O01i012;
/* 1842 */                  VarHandle.storeStoreFence();
/* 1845 */                  i0lio1O01i012.I01Io001O = i0lOo0io4;
/* 1849 */                  i0lio1O01i012.addOnAttachStateChangeListener(i0lio1O01i012.I00olI);
/* 1852 */                  i0lio1O01i012.setWillNotDraw(false);
/* 1856 */                  i0lio1O01i012.setFocusable(true);
/* 1861 */                  I0llii.I00000oIO.I00000oIO(i0lio1O01i012, 1, false);
/* 1864 */                  i0lio1O01i012.setFocusableInTouchMode(true);
/* 1867 */                  i0lio1O01i012.setClipChildren(false);
/* 1872 */                  OooiOl0ioo0i.I00000oOI(i0lio1O01i012, i0ll1oo);
/* 1879 */                  i0lio1O01i012.setOnDragListener(i0lio1O01i012.m27getDragAndDropManager());
/* 1884 */                  I0llOIO0O.I00000oIO.I00000oIO(i0lio1O01i012);
/* 1891 */                  if (I0lio1O01i01.I000l1()) {
/* 1895 */                      View view = new View(context);
/* 1904 */                      view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
/* 1912 */                      view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
/* 1915 */                      i0lio1O01i012.I00ll1 = view;
/* 1917 */                      i0lio1O01i012.addView(view, -1);
                            }
/* 1924 */                  IIOOoll iIOOoll = new IIOOoll(23);
/* 1931 */                  iIOOoll.I00iiI = lOO00IiI0li.I00000oIO(bool);
/* 1933 */                  VarHandle.storeStoreFence();
/* 1936 */                  i0lio1O01i012.I01IoO = iIOOoll;
/* 1940 */                  I0liiOI i0liiOI = new I0liiOI();
/* 1943 */                  i0liiOI.I00000oOI = i0lio1O01i012;
/* 1947 */                  OO1iIiOoO0.I00000oIO.getClass();
/* 1950 */                  VarHandle.storeStoreFence();
/* 1953 */                  i0lio1O01i012.I01O10iIoo1O = i0liiOI;
/* 1955 */                  VarHandle.storeStoreFence();
/* 1964 */                  i0100o111I.addView(i0lio1O01i012.getView(), I00000oIO);
/* 1967 */                  i0lio1O01i01 = i0lio1O01i012;
                        }
/* 1983 */              if (i0lio1O01i01.getComposeViewContext() != iOl10lI1) {
/* 1985 */                  i0100o111I.I000lI(iOl10lI1);
                        }
/* 1992 */              if (i0100o111I.getComposeViewContext$ui() != null) {
/* 1994 */                  iOl10lI1.I0000Il00O();
/* 1998 */                  i0lio1O01i01.setComposeViewContextIncrementedDuringInit$ui(true);
                        }
/* 2004 */              Object tag = i0lio1O01i01.getTag(R.id.wrapped_composition_tag);
/* 2013 */              i01l0iio = tag instanceof i01l0IiO ? (i01l0IiO) tag : null;
/* 2015 */              if (i01l0iio == null) {
/* 2025 */                  Ooi1loooOO1 ooi1loooOO1 = new Ooi1loooOO1(i0lio1O01i01.getRoot());
/* 2028 */                  iOl10lI1.I0000oI00();
/* 2035 */                  IOlIOiI0iiI1 iOlIOiI0iiI1 = new IOlIOiI0iiI1(iOl10lI1.I0000Il00O, ooi1loooOO1);
/* 2038 */                  i01l0iio = new i01l0IiO();
/* 2041 */                  i01l0iio.I00iOIl = i0lio1O01i01;
/* 2043 */                  i01l0iio.I00iiI = iOlIOiI0iiI1;
/* 2047 */                  i01l0iio.I00ilI0I1 = iIIi00i0.I00000oIO;
/* 2049 */                  VarHandle.storeStoreFence();
/* 2052 */                  i0lio1O01i01.setTag(R.id.wrapped_composition_tag, i01l0iio);
                        }
/* 2057 */              i01l0iio.I00000oOI(iOii1l);
/* 2060 */              iOl10lI1.I0000oI00();
/* 2063 */              IOl1ool0 iOl1ool0 = iOl10lI1.I0000Il00O;
/* 2067 */              i01l10O i01l10o = new i01l10O();
/* 2070 */              i01l10o.I00iOIl = iOl1ool0;
/* 2072 */              VarHandle.storeStoreFence();
/* 2075 */              i0lio1O01i01.setFrameEndScheduler$ui(i01l10o);
/* 3724 */              return i01l0iio;
                    }
/* 94 */            i0100o111I.removeAllViews();
/* 92 */            i0lio1O01i01 = null;
/* 98 */            if (i0lio1O01i01 == null) {
                    }
/* 1983 */          if (i0lio1O01i01.getComposeViewContext() != iOl10lI1) {
                    }
/* 1992 */          if (i0100o111I.getComposeViewContext$ui() != null) {
                    }
/* 2004 */          Object tag2 = i0lio1O01i01.getTag(R.id.wrapped_composition_tag);
/* 2013 */          if (tag2 instanceof i01l0IiO) {
                    }
/* 2015 */          if (i01l0iio == null) {
                    }
/* 2057 */          i01l0iio.I00000oOI(iOii1l);
/* 2060 */          iOl10lI1.I0000oI00();
/* 2063 */          IOl1ool0 iOl1ool02 = iOl10lI1.I0000Il00O;
/* 2067 */          i01l10O i01l10o2 = new i01l10O();
/* 2070 */          i01l10o2.I00iOIl = iOl1ool02;
/* 2072 */          VarHandle.storeStoreFence();
/* 2075 */          i0lio1O01i01.setFrameEndScheduler$ui(i01l10o2);
/* 3724 */          return i01l0iio;
                }
            }
