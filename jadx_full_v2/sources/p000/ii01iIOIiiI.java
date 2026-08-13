            package p000;

            import java.util.Iterator;
            import java.util.LinkedHashSet;
            
            public abstract class ii01iIOIiiI {
                public static final void I00000oIO(OI000ilOol oI000ilOol, LinkedHashSet linkedHashSet, O1iil1I01o o1iil1I01o, boolean z) {
/* 16 */            for (Ii1Ool1 ii1Ool1 : lIoi00l.I00000oIO(o1iil1I01o, IiOOioIIO0.I000oI1ioi, 2)) {
/* 26 */                if (ii1Ool1 instanceof OI000ilOol) {
/* 28 */                    OI000ilOol oI000ilOolI010iIIOlo = (OI000ilOol) ii1Ool1;
/* 34 */                    if (oI000ilOolI010iIIOlo.I00IO1()) {
/* 42 */                        IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = o1iil1I01o.I0000oI00(oI000ilOolI010iIIOlo.getName(), OIIl0iOOlo.I00iio);
/* 64 */                        oI000ilOolI010iIIOlo = iOIiO1lIl0lI0000oI00 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI0000oI00 : iOIiO1lIl0lI0000oI00 instanceof IiOoI0oI ? ((IiOoI0oI) iOIiO1lIl0lI0000oI00).I010iIIOlo() : null;
                            }
/* 65 */                    if (oI000ilOolI010iIIOlo != null) {
/* 68 */                        int i = IiOiIO0i1Oil.I00000oIO;
/* 78 */                        Iterator it = oI000ilOolI010iIIOlo.I000OOo1O().I0000oI00().iterator();
                                while (true) {
/* 86 */                            if (it.hasNext()) {
/* 102 */                               if (IiOiIO0i1Oil.I000o00OoI0I((O0iIl1) it.next(), oI000ilOol.I010i10l())) {
/* 104 */                                   linkedHashSet.add(oI000ilOolI010iIIOlo);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
/* 107 */                       if (z) {
/* 113 */                           I00000oIO(oI000ilOol, linkedHashSet, oI000ilOolI010iIIOlo.I00l0I0l0lO1(), z);
                                }
                            }
                        }
                    }
                }
            }
