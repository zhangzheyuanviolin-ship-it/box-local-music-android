            package p000;
            
            public final class O0io0IOIl implements Oli1o0 {
                public OI0lOIOi1l I00000oIO;
                public O0io0olo I00000oOI;
                public Object I0000Il00O;

                @Override
                public final void I00000oIO(I0lOo1lO i0lOo1lO) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 11 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00000oOI.I00l0OO0IO.I000II(this.I0000Il00O);
/* 24 */            O1ooOo o1ooOo = (o0iiOioolIi == null || (iIlOoolol0ll = o0iiOioolIi.I010101Oo1lO) == null) ? null : (O1ooOo) iIlOoolol0ll.I00io1l;
/* 25 */            if (o1ooOo == null || !o1ooOo.I00lll10) {
/* 77 */                return;
                    }
/* 33 */            lOo1ii0o1.I0000O(o1ooOo, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", i0lOo1lO);
                }

                @Override
                public final void I00000oOI() {
/* 5 */             this.I00000oOI.I000II(this.I0000Il00O);
                }

                @Override
                public final long I0000Il00O(int i) {
/* 11 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00000oOI.I00l0OO0IO.I000II(this.I0000Il00O);
/* 13 */            if (o0iiOioolIi == null || !o0iiOioolIi.I00Io1lO()) {
/* 124 */               return 0L;
                    }
/* 31 */            int i2 = ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).I00iiI).I00iiO;
/* 33 */            if (i < 0 || i >= i2) {
/* 64 */                IolioOO1.I0000oI00("Index (" + i + ") is out of bound of [0, " + i2 + ")");
                    }
/* 73 */            if (!this.I00000oIO.I0000Il00O(i)) {
/* 124 */               return 0L;
                    }
/* 91 */            int i3 = ((O0iiOioolIi) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).get(i)).I010I0.I00100l0.I00iOIl;
/* 122 */           return (((O0iiOioolIi) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).get(i)).I010I0.I00100l0.I00iiI & 4294967295L) | (i3 << 32);
                }

                @Override
                public final int I0000O() {
/* 11 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00000oOI.I00l0OO0IO.I000II(this.I0000Il00O);
/* 13 */            if (o0iiOioolIi != null) {
/* 25 */                return ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).I00iiI).I00iiO;
                    }
/* 28 */            return 0;
                }

                @Override
                public final void I0000oI00(int i, long j) {
/* 1 */             O0io0olo o0io0olo = this.I00000oOI;
/* 11 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) o0io0olo.I00l0OO0IO.I000II(this.I0000Il00O);
/* 13 */            if (o0iiOioolIi == null || !o0iiOioolIi.I00Io1lO()) {
/* 332 */               return;
                    }
/* 31 */            int i2 = ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).I00iiI).I00iiO;
/* 33 */            if (i < 0 || i >= i2) {
/* 64 */                IolioOO1.I0000oI00("Index (" + i + ") is out of bound of [0, " + i2 + ")");
                    }
/* 71 */            if (o0iiOioolIi.I00Io1o110i()) {
/* 75 */                IolioOO1.I00000oIO("Pre-measure called on node that is not placed");
                    }
/* 78 */            O0iiOioolIi o0iiOioolIi2 = o0io0olo.I00iOIl;
/* 81 */            o0iiOioolIi2.I00oI0i = true;
/* 101 */           ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).I0010o((O0iiOioolIi) ((OI0oIOI) o0iiOioolIi.I000o00OoI0I()).get(i), j);
/* 105 */           o0iiOioolIi2.I00oI0i = false;
/* 109 */           this.I00000oIO.I00000oIO(i);
                }
            }
