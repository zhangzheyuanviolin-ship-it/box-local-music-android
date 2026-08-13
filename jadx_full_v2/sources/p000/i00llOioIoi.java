            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class i00llOioIoi {
                public static final OI0l1oli1I I00000oIO;
                public static final i00li00iOi[] I00000oOI;

                static {
/* 5 */             OI0l1oli1I oI0l1oli1I = new OI0l1oli1I(8);
/* 10 */            i00li00iOi.I00000oIO.getClass();
/* 13 */            i00ll0o0il i00ll0o0ilVar = i00lO010I.I000II;
/* 16 */            oI0l1oli1I.I000OOo1O(1, i00ll0o0ilVar);
/* 19 */            i00ll0o0il i00ll0o0ilVar2 = i00lO010I.I0001Ioi1lo;
/* 22 */            oI0l1oli1I.I000OOo1O(2, i00ll0o0ilVar2);
/* 25 */            i00ll0o0il i00ll0o0ilVar3 = i00lO010I.I00000oOI;
/* 28 */            oI0l1oli1I.I000OOo1O(4, i00ll0o0ilVar3);
/* 31 */            i00ll0o0il i00ll0o0ilVar4 = i00lO010I.I0000O;
/* 33 */            oI0l1oli1I.I000OOo1O(8, i00ll0o0ilVar4);
/* 36 */            i00ll0o0il i00ll0o0ilVar5 = i00lO010I.I000O01llI0;
/* 40 */            oI0l1oli1I.I000OOo1O(16, i00ll0o0ilVar5);
/* 43 */            i00ll0o0il i00ll0o0ilVar6 = i00lO010I.I0000oI00;
/* 47 */            oI0l1oli1I.I000OOo1O(32, i00ll0o0ilVar6);
/* 50 */            i00ll0o0il i00ll0o0ilVar7 = i00lO010I.I000OOo1O;
/* 54 */            oI0l1oli1I.I000OOo1O(64, i00ll0o0ilVar7);
/* 57 */            i00ll0o0il i00ll0o0ilVar8 = i00lO010I.I0000Il00O;
/* 61 */            oI0l1oli1I.I000OOo1O(Barcode.FORMAT_ITF, i00ll0o0ilVar8);
/* 64 */            I00000oIO = oI0l1oli1I;
/* 95 */            I00000oOI = new i00li00iOi[]{i00ll0o0ilVar, i00ll0o0ilVar2, i00ll0o0ilVar3, i00ll0o0ilVar7, i00ll0o0ilVar5, i00ll0o0ilVar6, i00ll0o0ilVar4, i00lO010I.I000OiO, i00ll0o0ilVar8};
                }

                public static final void I00000oIO(O1Ii0OO o1Ii0OO, Iolo0O1 iolo0O1, long j, int i, int i2) {
/* 7 */             if (li1OOIio1Oi.I00000oIO(j, -1L)) {
/* 399 */               return;
                    }
/* 40 */            o1Ii0OO.I0000Il00O(iolo0O1.I00000oOI, (int) ((j >>> 48) & 65535));
/* 45 */            o1Ii0OO.I0000Il00O(iolo0O1.I0000Il00O, (int) ((j >>> 32) & 65535));
/* 50 */            o1Ii0OO.I0000Il00O(iolo0O1.I0000O, i - ((int) ((j >>> 16) & 65535)));
/* 55 */            o1Ii0OO.I0000Il00O(iolo0O1.I0000oI00, i2 - ((int) (j & 65535)));
                }
            }
