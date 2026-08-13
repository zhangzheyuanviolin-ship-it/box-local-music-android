            package p000;

            import android.database.Cursor;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class OlilIol extends OlilO10IOi0o {
                public int[] I00iio;
                public long[] I00ilI0I1;
                public double[] I00ilO0;
                public String[] I00io1l;
                public byte[][] I00ioIO;
                public Cursor I00l0I0l0lO1;

                public OlilIol(Olil0l0 olil0l0, String str) {
/* 1 */             super(olil0l0, str);
/* 7 */             this.I00iio = new int[0];
/* 11 */            this.I00ilI0I1 = new long[0];
/* 15 */            this.I00ilO0 = new double[0];
/* 19 */            this.I00io1l = new String[0];
/* 23 */            this.I00ioIO = new byte[0][];
                }

                public static void I000O01llI0(Cursor cursor, int i) {
/* 1 */             if (i < 0 || i >= cursor.getColumnCount()) {
/* 14 */                lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 37 */                throw null;
                    }
                }

                public final void I0000Il00O(int i, int i2) {
/* 2 */             int i3 = i2 + 1;
/* 3 */             int[] iArr = this.I00iio;
/* 6 */             if (iArr.length < i3) {
/* 12 */                this.I00iio = Arrays.copyOf(iArr, i3);
                    }
/* 14 */            if (i == 1) {
/* 66 */                long[] jArr = this.I00ilI0I1;
/* 69 */                if (jArr.length < i3) {
/* 75 */                    this.I00ilI0I1 = Arrays.copyOf(jArr, i3);
/* 106 */                   return;
                        }
/* 106 */               return;
                    }
/* 17 */            if (i == 2) {
/* 54 */                double[] dArr = this.I00ilO0;
/* 57 */                if (dArr.length < i3) {
/* 63 */                    this.I00ilO0 = Arrays.copyOf(dArr, i3);
/* 65 */                    return;
                        }
/* 106 */               return;
                    }
/* 20 */            if (i == 3) {
/* 40 */                String[] strArr = this.I00io1l;
/* 43 */                if (strArr.length < i3) {
/* 51 */                    this.I00io1l = (String[]) Arrays.copyOf(strArr, i3);
/* 53 */                    return;
                        }
/* 106 */               return;
                    }
/* 23 */            if (i != 4) {
/* 106 */               return;
                    }
/* 26 */            byte[][] bArr = this.I00ioIO;
/* 29 */            if (bArr.length < i3) {
/* 37 */                this.I00ioIO = (byte[][]) Arrays.copyOf(bArr, i3);
                    }
                }

                public final void I000II() {
/* 3 */             if (this.I00l0I0l0lO1 == null) {
/* 9 */                 IIOOoll iIOOoll = new IIOOoll(26);
/* 12 */                iIOOoll.I00iiI = this;
/* 14 */                VarHandle.storeStoreFence();
/* 23 */                this.I00l0I0l0lO1 = this.I00iOIl.I00IoIO0lI(iIOOoll);
                    }
                }

                @Override
                public final void I000OOo1O(int i, double d) {
/* 1 */             I00000oIO();
/* 5 */             I0000Il00O(2, i);
/* 10 */            this.I00iio[i] = 2;
/* 14 */            this.I00ilO0[i] = d;
                }

                @Override
                public final void I000OiO(int i, long j) {
/* 1 */             I00000oIO();
/* 5 */             I0000Il00O(1, i);
/* 10 */            this.I00iio[i] = 1;
/* 14 */            this.I00ilI0I1[i] = j;
                }

                @Override
                public final void I000iOII(int i, byte[] bArr) {
/* 1 */             I00000oIO();
/* 5 */             I0000Il00O(4, i);
/* 10 */            this.I00iio[i] = 4;
/* 14 */            this.I00ioIO[i] = bArr;
                }

                public final Cursor I000l1() {
/* 1 */             Cursor cursor = this.I00l0I0l0lO1;
/* 3 */             if (cursor != null) {
/* 5 */                 return cursor;
                    }
/* 10 */            lO0I01oIl1o.I00000oIO(21, "no row");
/* 20 */            throw null;
                }

                @Override
                public final void I000o00OoI0I(int i) {
/* 1 */             I00000oIO();
/* 5 */             I0000Il00O(5, i);
/* 10 */            this.I00iio[i] = 5;
                }

                @Override
                public final void I00Io1o110i(int i, String str) {
/* 1 */             I00000oIO();
/* 5 */             I0000Il00O(3, i);
/* 10 */            this.I00iio[i] = 3;
/* 14 */            this.I00io1l[i] = str;
                }

                @Override
                public final String I00i0O(int i) {
/* 1 */             I00000oIO();
/* 4 */             Cursor cursorI000l1 = I000l1();
/* 8 */             I000O01llI0(cursorI000l1, i);
/* 11 */            return cursorI000l1.getString(i);
                }

                @Override
                public final boolean I00ol1() {
/* 1 */             I00000oIO();
/* 4 */             I000II();
/* 7 */             Cursor cursor = this.I00l0I0l0lO1;
/* 9 */             if (cursor != null) {
/* 11 */                return cursor.moveToNext();
                    }
/* 18 */            I000II.I001IO000("Required value was null.");
/* 21 */            return false;
                }

                @Override
                public final void close() {
/* 3 */             if (!this.I00iiO) {
/* 5 */                 I00000oIO();
/* 11 */                this.I00iio = new int[0];
/* 15 */                this.I00ilI0I1 = new long[0];
/* 19 */                this.I00ilO0 = new double[0];
/* 23 */                this.I00io1l = new String[0];
/* 27 */                this.I00ioIO = new byte[0][];
/* 29 */                reset();
                    }
/* 33 */            this.I00iiO = true;
                }

                @Override
                public final byte[] getBlob(int i) {
/* 1 */             I00000oIO();
/* 4 */             Cursor cursorI000l1 = I000l1();
/* 8 */             I000O01llI0(cursorI000l1, i);
/* 11 */            return cursorI000l1.getBlob(i);
                }

                @Override
                public final int getColumnCount() {
/* 1 */             I00000oIO();
/* 4 */             I000II();
/* 7 */             Cursor cursor = this.I00l0I0l0lO1;
/* 9 */             if (cursor != null) {
/* 11 */                return cursor.getColumnCount();
                    }
/* 16 */            return 0;
                }

                @Override
                public final String getColumnName(int i) {
/* 1 */             I00000oIO();
/* 4 */             I000II();
/* 7 */             Cursor cursor = this.I00l0I0l0lO1;
/* 9 */             if (cursor != null) {
/* 11 */                I000O01llI0(cursor, i);
/* 14 */                return cursor.getColumnName(i);
                    }
/* 21 */            I000II.I001IO000("Required value was null.");
/* 24 */            return null;
                }

                @Override
                public final long getLong(int i) {
/* 1 */             I00000oIO();
/* 4 */             Cursor cursorI000l1 = I000l1();
/* 8 */             I000O01llI0(cursorI000l1, i);
/* 11 */            return cursorI000l1.getLong(i);
                }

                @Override
                public final boolean isNull(int i) {
/* 1 */             I00000oIO();
/* 4 */             Cursor cursorI000l1 = I000l1();
/* 8 */             I000O01llI0(cursorI000l1, i);
/* 11 */            return cursorI000l1.isNull(i);
                }

                @Override
                public final void reset() {
/* 1 */             I00000oIO();
/* 4 */             Cursor cursor = this.I00l0I0l0lO1;
/* 6 */             if (cursor != null) {
/* 8 */                 cursor.close();
                    }
/* 12 */            this.I00l0I0l0lO1 = null;
                }
            }
