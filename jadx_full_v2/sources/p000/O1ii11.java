            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class O1ii11 extends OI0lOii0I {
                public OiIi1OI I000l1;

                @Override
                public final void I000II() {
/* 3 */             Iterator it = this.I000l1.iterator();
                    while (true) {
/* 8 */                 OiIi0IIioO oiIi0IIioO = (OiIi0IIioO) it;
/* 14 */                if (!oiIi0IIioO.hasNext()) {
/* 55 */                    return;
                        }
/* 26 */                O1ii10Iil1O o1ii10Iil1O = (O1ii10Iil1O) ((Map.Entry) oiIi0IIioO.next()).getValue();
/* 30 */                o1ii10Iil1O.I00iOIl.I0001Ioi1lo(o1ii10Iil1O);
                    }
                }

                @Override
                public final void I000O01llI0() {
/* 3 */             Iterator it = this.I000l1.iterator();
                    while (true) {
/* 8 */                 OiIi0IIioO oiIi0IIioO = (OiIi0IIioO) it;
/* 14 */                if (!oiIi0IIioO.hasNext()) {
/* 55 */                    return;
                        }
/* 26 */                O1ii10Iil1O o1ii10Iil1O = (O1ii10Iil1O) ((Map.Entry) oiIi0IIioO.next()).getValue();
/* 30 */                o1ii10Iil1O.I00iOIl.I000OiO(o1ii10Iil1O);
                    }
                }
            }
