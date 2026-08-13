            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol0IlIIoOi extends O1ooOo implements O0iOoioOoI, OiiooOl {
                public float I00o0iI0io1;
                public float I00o0l1o1o0;
                public float I00o101lO;
                public float I00oI0i;
                public float I00oII;
                public float I00oIiI10;
                public float I00oO101o;
                public long I00oOio10iI1;
                public OioOIi1o0I I00ol1;
                public boolean I00olI;
                public long I00oli;
                public long I00oliIiO01i;
                public int I00oo1iO0ll;
                public int I00ooIo0;
                public O0iOIOiIIII I00ooiO1I;
                public OIoO1Ol I00oooO;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 5 */             int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 7 */             int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 12 */            OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(5);
/* 15 */            oiOi011iI1ol.I00iiI = oO1I0001000iI001lllioOl;
/* 17 */            oiOi011iI1ol.I00iiO = this;
/* 19 */            VarHandle.storeStoreFence();
/* 24 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, oiOi011iI1ol);
                }

                @Override
                public final boolean I000O01llI0() {
/* 1 */             return false;
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
/* 3 */             if (this.I00olI) {
/* 8 */                 Oil0Io.I000iOII(oil0O0I, this.I00ol1);
                    }
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final String toString() {
/* 3 */             float f = this.I00o0iI0io1;
/* 5 */             float f2 = this.I00o0l1o1o0;
/* 7 */             float f3 = this.I00o101lO;
/* 9 */             float f4 = this.I00oI0i;
/* 11 */            float f5 = this.I00oII;
/* 13 */            float f6 = this.I00oIiI10;
/* 15 */            float f7 = this.I00oO101o;
/* 19 */            String strI0000oI00 = OoI0l01O.I0000oI00(this.I00oOio10iI1);
/* 23 */            OioOIi1o0I oioOIi1o0I = this.I00ol1;
/* 25 */            boolean z = this.I00olI;
/* 29 */            String strI000OOo1O = IOOiio0i.I000OOo1O(this.I00oli);
/* 35 */            String strI000OOo1O2 = IOOiio0i.I000OOo1O(this.I00oliIiO01i);
/* 45 */            String strI00100l0 = IIlIOloOOO.I00100l0("CompositingStrategy(value=", this.I00oo1iO0ll, ")");
/* 51 */            String strI00000oIO = iOOolo0i0.I00000oIO(this.I00ooIo0);
/* 55 */            O0iOIOiIIII o0iOIOiIIII = this.I00ooiO1I;
/* 69 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
/* 73 */            sbI00100l0.append(f3);
/* 78 */            sbI00100l0.append(", translationX=");
/* 81 */            sbI00100l0.append(f4);
/* 86 */            sbI00100l0.append(", translationY=0.0, shadowElevation=");
/* 89 */            sbI00100l0.append(f5);
/* 94 */            sbI00100l0.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
/* 97 */            sbI00100l0.append(f6);
/* 102 */           sbI00100l0.append(", cameraDistance=");
/* 105 */           sbI00100l0.append(f7);
/* 110 */           sbI00100l0.append(", transformOrigin=");
/* 113 */           sbI00100l0.append(strI0000oI00);
/* 118 */           sbI00100l0.append(", shape=");
/* 121 */           sbI00100l0.append(oioOIi1o0I);
/* 126 */           sbI00100l0.append(", clip=");
/* 129 */           sbI00100l0.append(z);
/* 134 */           sbI00100l0.append(", renderEffect=null, ambientShadowColor=");
/* 141 */           IIl001iO0Io.I001lIiIIo1O(sbI00100l0, strI000OOo1O, ", spotShadowColor=", strI000OOo1O2, ", compositingStrategy=");
/* 150 */           IIl001iO0Io.I001lIiIIo1O(sbI00100l0, strI00100l0, ", blendMode=", strI00000oIO, ", colorFilter=nulloutsets=");
/* 155 */           sbI00100l0.append(o0iOIOiIIII);
/* 160 */           sbI00100l0.append(")");
/* 163 */           return sbI00100l0.toString();
                }
            }
