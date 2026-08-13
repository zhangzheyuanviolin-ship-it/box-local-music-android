            package p000;

            import android.graphics.Rect;
            import android.view.autofill.AutofillId;
            
            public final class I0lII0loi extends I1lOlIOIIOO implements Ili1i0IO1I0l {
                public IIlio101Io I00iOIl;
                public Oil01I0 I00iiI;
                public I0lio1O01i01 I00iiO;
                public OOo0Olol0o I00iio;
                public String I00ilI0I1;
                public Rect I00ilO0;
                public AutofillId I00io1l;
                public OI0lOIOi1l I00ioIO;
                public boolean I00l0I0l0lO1;

                @Override
                public final void I00000oIO(IliIO10oO0 iliIO10oO0, IliIO10oO0 iliIO10oO02) {
                    O0iiOioolIi o0iiOioolIiI000O01llI0;
                    OiioiIIlooo oiioiIIloooI001i1lo1io;
                    O0iiOioolIi o0iiOioolIiI000O01llI02;
                    OiioiIIlooo oiioiIIloooI001i1lo1io2;
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00iiO;
/* 3 */             IIlio101Io iIlio101Io = this.I00iOIl;
/* 6 */             if (iliIO10oO0 != null && (o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(iliIO10oO0)) != null && (oiioiIIloooI001i1lo1io2 = o0iiOioolIiI000O01llI02.I001i1lo1io()) != null && iOIiliI10oi.I00000oIO(oiioiIIloooI001i1lo1io2)) {
/* 32 */                iIlio101Io.I00oIiI10().notifyViewExited(i0lio1O01i01, o0iiOioolIiI000O01llI02.I00iiI);
                    }
/* 35 */            if (iliIO10oO02 == null || (o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO02)) == null || (oiioiIIloooI001i1lo1io = o0iiOioolIiI000O01llI0.I001i1lo1io()) == null || !iOIiliI10oi.I00000oIO(oiioiIIloooI001i1lo1io)) {
/* 332 */               return;
                    }
/* 55 */            int i = o0iiOioolIiI000O01llI0.I00iiI;
/* 57 */            OOo0Olol0o oOo0Olol0o = this.I00iio;
/* 65 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) oOo0Olol0o.I00000oIO.I00000oOI(i);
/* 67 */            if (o0iiOioolIi == null || o0iiOioolIi.I00io1l == -4) {
/* 332 */               return;
                    }
/* 74 */            I00Ol00 i00Ol00 = oOo0Olol0o.I0000Il00O;
/* 76 */            int iI0000O = oOo0Olol0o.I0000O(o0iiOioolIi);
/* 82 */            long[] jArr = (long[]) i00Ol00.I0000Il00O;
/* 84 */            long j = jArr[iI0000O];
/* 87 */            long j2 = jArr[iI0000O + 1];
/* 108 */           iIlio101Io.I00oIiI10().notifyViewEntered(i0lio1O01i01, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
                }
            }
