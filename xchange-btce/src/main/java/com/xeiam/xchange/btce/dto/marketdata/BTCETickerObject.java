/**
 * Copyright (C) 2012 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.btce.dto.marketdata;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Data object representing Ticker from BTCE
 * 
 * @immutable
 */
public final class BTCETickerObject {

  private final double last;
  private final double high;
  private final double low;
  private final double avg;
  private final double buy;
  private final double sell;
  private final double serverTime;
  private final double vol;
  private final double volCur;

  /**
   * Constructor
   * 
   * @param high
   * @param low
   * @param vol
   * @param last
   * @param avg
   * @param buy
   * @param serverTime
   * @param volCur
   * @param sell
   */
  public BTCETickerObject(@JsonProperty("high") double high, @JsonProperty("low") double low, @JsonProperty("vol") double vol, @JsonProperty("last") double last, @JsonProperty("avg") double avg,
      @JsonProperty("buy") double buy, @JsonProperty("server_time") double serverTime, @JsonProperty("vol_cur") double volCur, @JsonProperty("sell") double sell) {

    this.high = high;
    this.low = low;
    this.last = last;
    this.avg = avg;
    this.buy = buy;
    this.sell = sell;
    this.serverTime = serverTime;
    this.vol = vol;
    this.volCur = volCur;
  }

  public double getAvg() {

    return avg;
  }

  public double getBuy() {

    return buy;
  }

  public double getHigh() {

    return high;
  }

  public double getLast() {

    return last;
  }

  public double getLow() {

    return low;
  }

  public double getSell() {

    return sell;
  }

  public double getServerTime() {

    return serverTime;
  }

  public double getVol() {

    return vol;
  }

  public double getVolCur() {

    return volCur;
  }

  @Override
  public String toString() {

    return "BTCETickerObject [last=" + last + ", high=" + high + ", low=" + low + ", avg=" + avg + ", buy=" + buy + ", sell=" + sell + ", serverTime=" + serverTime + ", vol=" + vol + ", volCur="
        + volCur + "]";
  }

}
