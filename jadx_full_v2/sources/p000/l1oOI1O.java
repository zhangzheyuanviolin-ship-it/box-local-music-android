            package p000;
            
            public final class l1oOI1O implements Runnable {
                public boolean I00iOIl;
                public lIl1O1li I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
/* 1 */             lIl1O1li lil1o1li = this.I00iiI;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 7 */             boolean zI00000oIO = l0olllo1i.I00000oIO();
/* 13 */            boolean z = false;
/* 27 */            boolean z2 = l0olllo1i.I00oli != null && l0olllo1i.I00oli.booleanValue();
/* 28 */            boolean z3 = this.I00iOIl;
/* 34 */            l0olllo1i.I00oli = Boolean.valueOf(z3);
/* 36 */            if (z2 == z3) {
/* 38 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 40 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 51 */                l01o0io1ooo0.I00lll10.I0000Il00O("Default data collection state already set to", Boolean.valueOf(z3));
                    }
/* 58 */            if (l0olllo1i.I00000oIO() != zI00000oIO) {
/* 60 */                boolean zI00000oIO2 = l0olllo1i.I00000oIO();
/* 66 */                if (l0olllo1i.I00oli != null && l0olllo1i.I00oli.booleanValue()) {
/* 76 */                    z = true;
                        }
/* 77 */                if (zI00000oIO2 != z) {
/* 79 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 81 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 96 */                    l01o0io1ooo02.I00li1OI.I0000O(Boolean.valueOf(z3), "Default data collection is different than actual status", Boolean.valueOf(zI00000oIO));
                        }
                    }
/* 99 */            lil1o1li.I011Ol0();
                }
            }
